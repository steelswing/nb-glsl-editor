
package hu.racz.zalan.editor.markoccurrence;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.Element;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.api.editor.mimelookup.MimePath;
import org.netbeans.api.editor.settings.FontColorSettings;
import org.netbeans.modules.csl.api.ColoringAttributes;
import org.netbeans.spi.editor.highlighting.support.*;
import org.openide.util.*;

public class GlslMarkOccurrencesHighlighter implements CaretListener, Runnable {

    public static final Color ES_COLOR = new Color(175, 172, 102); // new Color(244, 164, 113);
    public static ColoringAttributes.Coloring MO = ColoringAttributes.add(ColoringAttributes.empty(), ColoringAttributes.MARK_OCCURRENCES);

//    private static final AttributeSet HIGHLIGHT_COLOR = AttributesUtilities.createImmutable(StyleConstants.Background, new Color(236, 235, 163, 100));
    private final static int REFRESH_DELAY = 300;

    private final OffsetsBag bag;
    private final Document document;
    private final JTextComponent textComponent;
    private final RequestProcessor requestProcessor;
    private RequestProcessor.Task lastRefreshTask;

    private int caretPosition;
    private Scope caretScope;

    private FontColorSettings fcs = MimeLookup.getLookup(MimePath.get("text/x-glsl")).lookup(FontColorSettings.class);

    public GlslMarkOccurrencesHighlighter(Document document) {
        requestProcessor = new RequestProcessor(GlslMarkOccurrencesHighlighter.class);
        bag = new OffsetsBag(document);
        this.document = document;
        textComponent = Utility.getTextComponent(document);
        if (textComponent != null) {
            textComponent.addCaretListener(this);
        }
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        if (lastRefreshTask == null) {
            lastRefreshTask = requestProcessor.create(this);
        }
        lastRefreshTask.schedule(REFRESH_DELAY);
    }

    @Override
    public void run() {
        initializeHighlight();
        addFunctionOccurrences();
        addVariableOccurrences();
        addTypeOccurrences();
    }

    private void initializeHighlight() {
        bag.clear();
        caretPosition = textComponent.getCaretPosition();
        initializeScopes();
    }

    private void initializeScopes() {
        try {
            GlslProcessor.setText(document.getText(0, document.getLength()));
            caretScope = GlslProcessor.getCaretScope(caretPosition);
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    //
    //functions-----------------------------------------------------------------
    //
    private void addFunctionOccurrences() {
        Function func = findFunction();
        addFunctionOccurrences(func);
    }

    private Function findFunction() {
        Function func = findFunctionPrototypeSFunctionAtCaret();
        func = func == null ? findFunctionDefinitionSFunctionAtCaret() : func;
        return func == null ? findFunctionCallSFunctionAtCaret() : func;
    }

    private Function findFunctionPrototypeSFunctionAtCaret() {
        for (FunctionDeclaration fp : Scope.getFunctionPrototypes()) {
            if (isElementAtCaret(fp)) {
                return fp.getFunction();
            }
        }
        return null;
    }

    private Function findFunctionDefinitionSFunctionAtCaret() {
        for (FunctionDeclaration fd : Scope.getFunctionDefinitions()) {
            if (isElementAtCaret(fd)) {
                return fd.getFunction();
            }
        }
        return null;
    }

    private Function findFunctionCallSFunctionAtCaret() {
        for (FunctionCall fc : caretScope.getFunctionCalls()) {
            if (isElementAtCaret(fc)) {
                return fc.getFunction();
            }
        }
        return null;
    }

    private void addFunctionOccurrences(Function func) {
        if (func != null && !func.isConstructor()) {
            if (func.getDefinition() != null) {
                addElementToBag(func.getDefinition());
            }
            addFunctionPrototypeOccurrences(func);
            addFunctionCallOccurrences(func);
        }
    }

    private void addFunctionPrototypeOccurrences(Function f) {
        for (FunctionDeclaration fp : f.getPrototypes()) {
            addElementToBag(fp);
        }
    }

    private void addFunctionCallOccurrences(Function f) {
        for (FunctionCall fp : f.getCalls()) {
            addElementToBag(fp);
        }
    }

    //
    //variables-----------------------------------------------------------------
    //
    private void addVariableOccurrences() {
        VariableDeclaration declaration = findVariableDeclaration();
        addVariableOccurrences(declaration);
    }

    private VariableDeclaration findVariableDeclaration() {
        VariableDeclaration vd = findVariableDeclarationAtCaret();
        return vd == null ? findVariableUsageSDeclarationAtCaret() : vd;
    }

    private VariableDeclaration findVariableDeclarationAtCaret() {
        for (VariableDeclaration vd : caretScope.getVariableDeclarations()) {
            if (isElementAtCaret(vd)) {
                return vd;
            }
        }
        return null;
    }

    private VariableDeclaration findVariableUsageSDeclarationAtCaret() {
        for (VariableUsage vu : caretScope.getVariableUsages()) {
            if (isElementAtCaret(vu)) {
                return vu.getDeclaration();
            }
        }
        return null;
    }

    private void addVariableOccurrences(VariableDeclaration declaration) {
        if (declaration != null) {
            addElementToBag(declaration);
            for (VariableUsage vu : declaration.getUsages()) {
                addElementToBag(vu);
            }
        }
    }

    //
    //types---------------------------------------------------------------------
    //
    private void addTypeOccurrences() {
        TypeDeclaration declaration = findTypeDeclaration();
        addTypeOccurrences(declaration);
    }

    private TypeDeclaration findTypeDeclaration() {
        TypeDeclaration td = findTypeDeclarationAtCaret();
        return td == null ? findTypeUsageSDeclarationAtCaret() : td;
    }

    private TypeDeclaration findTypeDeclarationAtCaret() {
        if (caretScope.getParent() != null) {
            return findTypeDeclarationAtCaret(caretScope.getParent());
        } else {
            return null;
        }
    }

    private TypeDeclaration findTypeDeclarationAtCaret(Scope scope) {
        for (TypeDeclaration td : scope.getTypeDeclarations()) {
            if (isElementAtCaret(td)) {
                return td;
            }
        }
        return null;
    }

    private TypeDeclaration findTypeUsageSDeclarationAtCaret() {
        for (TypeUsage vu : caretScope.getTypeUsages()) {
            if (isElementAtCaret(vu)) {
                return vu.getDeclaration();
            }
        }
        return null;
    }

    private void addTypeOccurrences(TypeDeclaration declaration) {
        if (declaration != null) {
            addElementToBag(declaration);
            for (TypeUsage tu : declaration.getUsages()) {
                addElementToBag(tu);
            }
        }
    }

    //
    //misc----------------------------------------------------------------------
    //
    private boolean isElementAtCaret(Element element) {
        return element.getNameStartIndex() <= caretPosition && element.getNameStopIndex() >= caretPosition;
    }

    private void addElementToBag(Element element) {
        AttributeSet atrib = fcs.getTokenFontColors("mark-occurrences");
        if (atrib == null) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "no colors for: {0}", "mark-occurrences");
            return;
        }

        bag.addHighlight(element.getNameStartIndex(), element.getNameStopIndex(), atrib);
    }

    public OffsetsBag getHighlightsBag() {
        return bag;
    }

}

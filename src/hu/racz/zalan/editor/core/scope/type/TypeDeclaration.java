
package hu.racz.zalan.editor.core.scope.type;

import hu.racz.zalan.editor.core.Utility;
import hu.racz.zalan.editor.core.scope.CompletionElement;
import hu.racz.zalan.editor.core.scope.Element;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;
import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

public class TypeDeclaration extends Element implements CompletionElement {

    private static final ImageIcon BI_ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/bi_type.png"));
    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/type.png"));

    private static final String CLASS_COLOR = Utility.getHTMLColor(150, 64, 64);
    private static final String PKG_COLOR = Utility.getHTMLColor(192, 192, 192);

    private boolean builtIn;
    private int structStartIndex;
    private int structStopIndex;
    private int width = -1;
    private int height = -1;
    private TypeBase typeBase;
    private TypeCategory typeCategory = TypeCategory.CUSTOM;
    private final List<TypeDeclaration> implicitConversions = new ArrayList<>();
    private final List<VariableDeclaration> members = new ArrayList<>();
    private final List<TypeUsage> usages = new ArrayList<>();

    public TypeDeclaration(String name) {
        super(name);
    }

    public TypeDeclaration(String name, boolean builtIn, TypeCategory typeCategory) {
        this(name);
        setBuiltIn(builtIn);
        setTypeCategory(typeCategory);
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    public TypeCategory getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(TypeCategory typeCategory) {
        this.typeCategory = typeCategory;
    }

    public int getStructStartIndex() {
        return structStartIndex;
    }

    public void setStructStartIndex(int structStartIndex) {
        this.structStartIndex = structStartIndex;
    }

    public int getStructStopIndex() {
        return structStopIndex;
    }

    public void setStructStopIndex(int structStopIndex) {
        this.structStopIndex = structStopIndex;
    }

    //
    //usages--------------------------------------------------------------------
    //
    public void addUsage(TypeUsage vu) {
        usages.add(vu);
    }

    public List<TypeUsage> getUsages() {
        return Collections.unmodifiableList(usages);
    }

    //
    //implicit conversions------------------------------------------------------
    //
    public void addImplicitConversion(TypeDeclaration td) {
        implicitConversions.add(td);
    }

    public List<TypeDeclaration> getImplicitConversions() {
        return Collections.unmodifiableList(implicitConversions);
    }

    public boolean isConvertibleTo(TypeDeclaration td) {
        return getName().equals(td.getName()) || implicitConversions.contains(td);
    }

    //
    //members-------------------------------------------------------------------
    //
    public void addMember(VariableDeclaration vd) {
        members.add(vd);
    }

    public List<VariableDeclaration> getMembers() {
        return Collections.unmodifiableList(members);
    }

    //
    //dimensions----------------------------------------------------------------
    //
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isScalar() {
        return width == 1 && height == 1;
    }

    public boolean isVector() {
        return width > 1 && height == 1;
    }

    public boolean isMatrix() {
        return width > 1 && height > 1;
    }

    //
    //type base-----------------------------------------------------------------
    //
    public TypeBase getTypeBase() {
        return typeBase;
    }

    public void setTypeBase(TypeBase typeBase) {
        this.typeBase = typeBase;
    }

    //
    //misc----------------------------------------------------------------------
    //
    @Override
    public ImageIcon getIcon() {
        return isBuiltIn() ? BI_ICON : ICON;
    }

    @Override
    public int getPriority() {
        return TYPE_PRIORITY;
    }

    @Override
    public String getLeftText() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLASS_COLOR);
        if (isBuiltIn()) {
            sb.append(Utility.BOLD);
        }
        sb.append(Utility.escape(getName()));
        sb.append(Utility.COLOR_END);
        if (isBuiltIn()) {
            sb.append(Utility.BOLD_END);
        }
        return sb.toString();
    }

    @Override
    public String getRightText() {
        return null;
    }

    @Override
    public String getPasteText() {
        return getName() + " ";
    }

    @Override
    public String getDocumentationName() {
        return null;
    }

}

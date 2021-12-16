
package hu.racz.zalan.editor.core;

import java.awt.*;
import java.lang.ref.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.text.*;
import org.netbeans.modules.editor.*;
import org.netbeans.swing.plaf.LFCustoms;
import org.openide.cookies.*;
import org.openide.loaders.*;
import org.openide.xml.XMLUtil;

public class Utility {

    public static final String COLOR_END = "</font>"; //NOI18N
    public static final String STRIKE = "<s>"; //NOI18N
    public static final String STRIKE_END = "</s>"; //NOI18N
    public static final String BOLD = "<b>"; //NOI18N
    public static final String BOLD_END = "</b>"; //NOI18N

    public static void replaceAll(StringBuilder sb, Pattern pattern, String replacement) {
        Matcher m = pattern.matcher(sb);
        int start = 0;
        while (m.find(start)) {
            sb.replace(m.start(), m.end(), replacement);
            start = m.start() + replacement.length();
        }
    }

    public static int getCaretPosition(Document document) {
        return getTextComponent(document).getCaretPosition();
    }

    public static void setCaretPosition(Document document, int position) {
        JTextComponent tc = getTextComponent(document);
        if (tc != null) {
            tc.setCaretPosition(position);
        }
    }

    public static JTextComponent getTextComponent(Document document) {
        WeakReference<Document> weakDoc = new WeakReference<>(document);
        DataObject dobj = NbEditorUtilities.getDataObject(weakDoc.get());
        if (dobj != null) {
            return getTextComponent(dobj);
        }
        return null;
    }

    private static JTextComponent getTextComponent(DataObject dobj) {
        EditorCookie pane = dobj.getLookup().lookup(EditorCookie.class);
        JEditorPane[] panes = pane.getOpenedPanes();
        if (panes != null && panes.length > 0) {
            return panes[0];
        }
        return null;
    }

    public static void setCaretPositionInAwtThread(final Document document, final int position) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Utility.setCaretPosition(document, position);
            }
        });
    }

    public static String getHTMLColor(int r, int g, int b) {
        Color c = LFCustoms.shiftColor(new Color(r, g, b));
        return "<font color=#" //NOI18N
                +
                 LFCustoms.getHexString(c.getRed()) +
                LFCustoms.getHexString(c.getGreen()) +
                LFCustoms.getHexString(c.getBlue()) +
                ">"; //NOI18N
    }

    public static String escape(String s) {
        if (s != null) {
            try {
                return XMLUtil.toElementContent(s);
            } catch (Exception ex) {
            }
        }
        return s;
    }
}

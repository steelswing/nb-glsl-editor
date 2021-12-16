
package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.core.Utility;
import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

public class Keyword implements CompletionElement {

    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/keyword.png"));
    private static final String KEYWORD_COLOR = Utility.getHTMLColor(64, 64, 217);

    private String name = "";

    public Keyword(String name) {
        setName(name);
    }

    //
    //name----------------------------------------------------------------------
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //
    //completion----------------------------------------------------------------
    //
    @Override
    public ImageIcon getIcon() {
        return ICON;
    }

    @Override
    public int getPriority() {
        return KEYWORD_PRIORITY;
    }

    @Override
    public String getLeftText() {
        StringBuilder sb = new StringBuilder();
        sb.append(KEYWORD_COLOR);
        sb.append(Utility.BOLD);
        sb.append(getName());
        for (int i = 0; i < 10; i++) {
            sb.append("[]"); //NOI18N
        }
        sb.append(Utility.BOLD_END);
        sb.append(Utility.COLOR_END);
        return sb.toString();
    }

    @Override
    public String getRightText() {
        return null;
    }

    @Override
    public String getPasteText() {
        return  getName();
    }

    @Override
    public String getDocumentationName() {
        return null;
    }

    //
    //misc----------------------------------------------------------------------
    //
    @Override
    public boolean equals(Object obj) {
        Keyword kw = (Keyword) obj;
        return getName().equals(kw.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}

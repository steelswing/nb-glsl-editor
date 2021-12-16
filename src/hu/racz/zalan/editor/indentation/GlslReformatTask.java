
package hu.racz.zalan.editor.indentation;

import hu.racz.zalan.editor.core.Utility;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

public class GlslReformatTask implements ReformatTask {

    private final Context context;

    public GlslReformatTask(Context context) {
        this.context = context;
    }

    @Override
    public void reformat() throws BadLocationException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    int caretPos = Utility.getCaretPosition(context.document());
                    final int start = context.startOffset();
                    final int end = context.endOffset();
                    String input = context.document().getText(start, end);
                    context.document().remove(start, end - start);
                    context.document().insertString(start, Beautifier.beautify(input), null);
                    Utility.setCaretPositionInAwtThread(context.document(), caretPos);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public ExtraLock reformatLock() {
        return null;
    }

}

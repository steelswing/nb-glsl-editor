
package hu.racz.zalan.editor.file;

import static hu.racz.zalan.editor.core.Constants.*;
import java.io.*;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.openide.awt.*;
import org.openide.filesystems.*;
import org.openide.loaders.*;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@Messages({
    "LBL_Glsl_LOADER=Files of Glsl"
})
@MIMEResolver.ExtensionRegistration(
        displayName = "#LBL_Glsl_LOADER",
        mimeType = GLSL_MIME_TYPE,
        extension = {"glsl", "vs", "fs", "vsh", "fsh", "shader", "vertex", "fragment", "frag", "vert"}
)
@DataObject.Registration(
        mimeType = GLSL_MIME_TYPE,
        iconBase = "hu/racz/zalan/editor/file/res/logo.png",
        displayName = "#LBL_Glsl_LOADER",
        position = 300
)
@ActionReferences({
    @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_SYSTEM, id = OPENIDE_ACTIONS + "OpenAction"),
            position = 100,
            separatorAfter = 200
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_EDIT, id = OPENIDE_ACTIONS + "CutAction"),
            position = 300
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_EDIT, id = OPENIDE_ACTIONS + "CopyAction"),
            position = 400,
            separatorAfter = 500
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_EDIT, id = OPENIDE_ACTIONS + "DeleteAction"),
            position = 600
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_SYSTEM, id = OPENIDE_ACTIONS + "RenameAction"),
            position = 700,
            separatorAfter = 800
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_SYSTEM, id = OPENIDE_ACTIONS + "SaveAsTemplateAction"),
            position = 900,
            separatorAfter = 1000
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_SYSTEM, id = OPENIDE_ACTIONS + "FileSystemAction"),
            position = 1100,
            separatorAfter = 1200
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_SYSTEM, id = OPENIDE_ACTIONS + "ToolsAction"),
            position = 1300
    ),
     @ActionReference(
            path = LOADERS_ACTIONS,
            id = @ActionID(category = CATEGORY_SYSTEM, id = OPENIDE_ACTIONS + "PropertiesAction"),
            position = 1400
    )
})
public class GlslDataObject extends MultiDataObject {

    private static final long serialVersionUID = 1L;

    public GlslDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        registerEditor(GLSL_MIME_TYPE, false);
    }

    @Override
    protected int associateLookup() {
        return 1;
    }

    @MultiViewElement.Registration(
            displayName = "#LBL_SL_EDITOR",
            iconBase = "hu/racz/zalan/editor/file/res/logo.png",
            mimeType = "text/x-glsl",
            persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
            preferredID = "SL",
            position = 1000
    )
    @Messages("LBL_SL_EDITOR=Source")
    public static MultiViewEditorElement createEditor(Lookup lkp) {
        return new MultiViewEditorElement(lkp);
    }
}

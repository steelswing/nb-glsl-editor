package hu.racz.zalan.editor.bracematching;

import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.spi.editor.bracesmatching.*;
import org.netbeans.spi.editor.bracesmatching.support.*;
import static hu.racz.zalan.editor.core.Constants.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = BracesMatcherFactory.class)
public class GlslBracesMatcherFactory implements BracesMatcherFactory {

    @Override
    public BracesMatcher createMatcher(MatcherContext context) {
        return BracesMatcherSupport.characterMatcher(context, -1, -1, new char[]{LRB, RRB, LCB, RCB, LSB, RSB});
    }
}

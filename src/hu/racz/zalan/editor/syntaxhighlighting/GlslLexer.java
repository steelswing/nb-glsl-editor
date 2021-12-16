package hu.racz.zalan.editor.syntaxhighlighting;

import hu.racz.zalan.editor.antlr.*;
import hu.racz.zalan.editor.antlr.generated.*;
import org.antlr.v4.runtime.*;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.*;

public class GlslLexer implements Lexer<GlslTokenId> {

    private final LexerRestartInfo<GlslTokenId> info;
    private final AntlrGlslLexer glslLexer;

    public GlslLexer(LexerRestartInfo<GlslTokenId> info) {
        this.info = info;
        AntlrCharStream acs = new AntlrCharStream(info.input(), "GLSL Editor");
        glslLexer = new AntlrGlslLexer(acs);
    }

    @Override
    public org.netbeans.api.lexer.Token<GlslTokenId> nextToken() {
        Token token = glslLexer.nextToken();
        if (token.getType() != Token.EOF) {
            return createToken(token.getType());
        } else if (info.input().readLength() > 0) {
            return createToken(AntlrGlslLexer.SPACE);
        }
        return null;
    }

    private org.netbeans.api.lexer.Token<GlslTokenId> createToken(int token) {
        GlslTokenId tokenId = GlslLanguageHierarchy.getToken(token);
        return info.tokenFactory().createToken(tokenId);
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {

    }

}

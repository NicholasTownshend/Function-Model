package parsing.tokens;

import parsing.Parser;

import java.util.Optional;

public abstract class TokenHandler {
    protected TokenHandler nextHandler;

    public TokenHandler() {
        this.nextHandler = null;
    }

    public Optional<Token> handle(Parser<Character> parser) {
        if (canCreate(parser)) {
            return create(parser);
        }

        if (nextHandler == null) return Optional.empty();
        return nextHandler.handle(parser);
    }

    public void setNextHandler(TokenHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean canCreate(Parser<Character> parser);
    public abstract Optional<Token> create(Parser<Character> parser);
}

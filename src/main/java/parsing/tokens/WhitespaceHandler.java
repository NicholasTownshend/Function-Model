package parsing.tokens;

import parsing.Parser;

import java.util.Optional;

public class WhitespaceHandler extends TokenHandler {
    @Override
    public boolean canCreate(Parser<Character> parser) {
        return peekIsWhitespace(parser.peek());
    }

    private boolean peekIsWhitespace(Optional<Character> peek) {
        if (peek.isEmpty()) return false;
        return Character.isWhitespace(peek.get());
    }

    @Override
    public Optional<Token> create(Parser<Character> parser) {
        while (true) {
            if (!peekIsWhitespace(parser.peek())) break;
            parser.next();
        }

        return Optional.empty();
    }
}

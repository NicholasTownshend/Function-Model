package parsing.tokens;

import parsing.Parser;

import java.util.Optional;

public class NumberHandler extends TokenHandler {
    @Override
    public boolean canCreate(Parser<Character> parser) {
        return peekIsDigit(parser.peek());
    }

    private boolean peekIsDigit(Optional<Character> peek) {
        if (peek.isEmpty()) return false;
        return Character.isDigit(peek.get());
    }

    @Override
    public Optional<Token> create(Parser<Character> parser) {
        StringBuilder sb = new StringBuilder();

        while (peekIsDigit(parser.peek())) {
            sb.append(parser.next().get());
        }

        if (sb.isEmpty()) return Optional.empty();
        Token token = new Token(TokenType.NUMBER, sb.toString());

        return Optional.of(token);
    }
}

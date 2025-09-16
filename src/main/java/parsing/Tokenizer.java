package parsing;

import parsing.tokens.Token;
import parsing.tokens.TokenHandler;
import util.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tokenizer {
    // lets the tokenizer know that the parser is ready
    private boolean ready;
    private Parser<Character> parser;
    private TokenHandler handler;

    public Tokenizer(TokenHandler handler) {
        this.ready = false;
        this.parser = null;
        this.handler = handler;
    }

    public void setSource(String source) {
        // Convert source to array and feed to parser
        Character[] sourceArray = Helper.stringToCharObjArray(source);
        parser = new Parser<>(sourceArray);

        ready = true;
    }

    public List<Token> tokenize() {
        List<Token> tokens = new ArrayList<>();
        while (parser.peek().isPresent()) {
            Optional<Token> token = handler.handle(parser);
            token.ifPresent(tokens::add);
        }

        return tokens;
    }
}

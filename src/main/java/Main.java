import parsing.Tokenizer;
import parsing.tokens.NumberHandler;
import parsing.tokens.Token;
import parsing.tokens.TokenHandler;
import parsing.tokens.WhitespaceHandler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // set up token handlers
        TokenHandler whitespaceHandler = new WhitespaceHandler();
        TokenHandler numberHandler = new NumberHandler();
        numberHandler.setNextHandler(whitespaceHandler);

        // create tokenizer with handler
        Tokenizer tokenizer = new Tokenizer(numberHandler);

        // create source and set tokenizer's source
        String source = "   125673196   128730912   ";
        tokenizer.setSource(source);

        // tokenize the source
        List<Token> tokens = tokenizer.tokenize();

        tokens.forEach(System.out::println);
    }
}

package parsing;

import java.util.Optional;
import java.util.function.Predicate;

public class Parser<T> {
    private final T[] source;
    private int index = 0;

    public Parser(T[] source) {
        this.source = source;
    }

    public Optional<T> next() {
        if (index >= source.length) return Optional.empty();
        return Optional.of(source[index++]);
    }

    public Optional<T> peek() {
        return peek(0);
    }

    public Optional<T> peek(int offset) {
        int index = this.index + offset;
        if (index >= source.length) return Optional.empty();
        return Optional.of(source[index]);
    }

    public Optional<T> ifThenNext(Predicate<T> predicate) {
        var peek = peek();
        if (peek.isEmpty()) return Optional.empty();
        return Optional.ofNullable(predicate.test(peek.get()) ? peek.get() : null);
    }
}

package nodes;

import java.util.Optional;

/**
 * Represents a single algebraic variable
 */
public class Variable implements Node {
    private final String identifier;

    public Variable(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public Optional<Node> evaluate(Node var, Node input) {
        // if the variable matches
        if (var.equals(this)) {
            // replace the instance of the variable with the input provided
            return Optional.of(input);
        }

        // otherwise, continue with just the original variable
        return Optional.of(this);
    }

    @Override
    public String toLatex() {
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Variable var)) {
            return false;
        }

        return var.identifier.equals(identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }
}

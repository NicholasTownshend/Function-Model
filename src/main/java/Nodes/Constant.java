package Nodes;

import java.util.Optional;

public class Constant implements Node {
    // the value of the number represented by the constant
    private final double constant;

    /**
     * Constructor for the constant
     * @param constant the value of the constant being represented
     */
    public Constant(double constant) {
        this.constant = constant;
    }

    @Override
    public Optional<Node> evaluate(Node var, Node input) {
        return Optional.of(this);
    }

    @Override
    public String toLatex() {
        return String.valueOf(constant);
    }
}

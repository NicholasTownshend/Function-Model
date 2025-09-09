package Nodes;

import java.util.Optional;

public class Constant implements Node {
    double constant;

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

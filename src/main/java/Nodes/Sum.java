package Nodes;

import java.util.Optional;

/**
 * Represents the binary operator '+' within the algebraic system.
 * The expression would be (this.left)+(this.right)
 */
public class Sum implements Node {
    // the left summand
    private Node left;

    // the right summand
    private Node right;

    public Sum(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Optional<Node> evaluate(Node var, Node input) {
        Optional<Node> lEvaluate = left.evaluate(var, input);
        Optional<Node> rEvaluate = right.evaluate(var, input);

        if (lEvaluate.isEmpty() || rEvaluate.isEmpty()) return Optional.empty();

        Node sumEvaluate = new Sum(lEvaluate.get(), rEvaluate.get());
        return Optional.of(sumEvaluate);
    }

    @Override
    public String toLatex() {
        String l = this.left.toLatex();
        String r = this.right.toLatex();

        return "(" + l + ")" + "+" + "(" + r + ")";
    }
}

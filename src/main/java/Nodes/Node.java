package Nodes;

import java.util.Optional;

public interface Node {
    /**
     * Evaluates the node
     * @param var the node to be assigned the value of input
     * @param input the input for the variable
     * @return the resulting expression produced by the algebraic input
     */
    Optional<Node> evaluate(Node var, Node input);

    /**
     * Method for getting the latex representation of a node
     * @return string of the latex representation of this node
     */
    String toLatex();
}

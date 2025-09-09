package Nodes;

import java.util.Optional;

public interface Node {
    Optional<Node> evaluate(Node var, Node input);
    String toLatex();
}

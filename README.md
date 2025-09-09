# Intention

The codebase is intended to be a algebraic model. It's in its very earliest little baby steps.

## Modelling


Each algebraic object implements the Node interface. This Node interface is stored in the file [Node.java](src/main/java/Node.java).
It contains the methods:

- evaluate(Node var, Node input): Optional<Node>
- toLatex(): String

### Evaluate
Calling the `evaluate(Node var, Node input)` method on a given instance of a `Node` 
replaces each reference to `var` (within the `Node` object) with the instance of `input`.

### LaTeX
Calling the `toLatex()` method on a given instance of a `Node`
should return the accurate LaTeX representation of the algebraic expression being modelled.

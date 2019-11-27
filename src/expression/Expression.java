package expression;

import notation.Notation;

public interface Expression {

    int evaluate(int x);

    Expression derive();

    String toString(Notation notation);
}

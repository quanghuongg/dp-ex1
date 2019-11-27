package expression;

import notation.Notation;

public interface Expression {

    double evaluate(int x);

    Expression derive();

    String toString(Notation notation);
}

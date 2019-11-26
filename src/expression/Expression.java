package expression;

import notation.Notation;

public interface Expression {

    double evaluate(double x);

    Expression derive();

    String toString(Notation notation);
}

package expression;

import notation.Notation;

public abstract class BinaryExp implements Expression {

    public Expression expression1;
    public Expression expression2;

    @Override
    public double evaluate(double x) {
        return 0;
    }

    @Override
    public Expression derive() {
        return null;
    }

    @Override
    public String toString(Notation notation) {
        return null;
    }
}

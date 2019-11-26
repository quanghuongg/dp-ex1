package expression;

import notation.Notation;

public class MonimialExp implements Expression {
    //prop
    public double n;
    public double a;

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

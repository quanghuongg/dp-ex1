package expression;

import notation.Notation;

public class ConstExp implements Expression {
    //prop
    public double value = 0;

    //method
    @Override
    public double evaluate(double value) {
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

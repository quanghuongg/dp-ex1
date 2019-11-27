package expression;

import notation.Notation;

public class ConstExp implements Expression {
    //prop
    public int value = 0;

    public ConstExp(int value) {
        this.value = value;
    }

    //method
    @Override
    public int evaluate(int value) {
        return value;
    }

    @Override
    public Expression derive() {
        return new ConstExp(value);
    }

    @Override
    public String toString(Notation notation) {
        return value + "";
    }

}

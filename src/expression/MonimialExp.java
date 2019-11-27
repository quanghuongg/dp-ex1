package expression;

import notation.Notation;

public class MonimialExp implements Expression {
    //prop
    public int n;
    public int a;

    @Override
    public double evaluate(int x) {

        return a * Math.pow(x, n);
    }

    @Override
    public Expression derive() {
        return null;
    }

    public MonimialExp(int a, int n) {
        this.n = n;
        this.a = a;
    }

    public MonimialExp() {
    }

    @Override
    public String toString(Notation notation) {
        if (a == 0) {
            return "0";
        }
        if (n == 0) {
            if (a == 1) {
                return "x";
            } else {
                return a + "*x";
            }
        }
        if (n == 1)
            return this.a + "*x";

        return this.a + "*x^" + this.n;
    }

    public Expression createInstance() {
        if (a == 0) {
            return new ConstExp(0);
        }
        return new MonimialExp(a, n);
    }
}

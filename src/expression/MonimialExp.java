package expression;

import notation.Notation;

public class MonimialExp implements Expression {
    //prop
    public int n;
    public int a;

    @Override
    public int evaluate(int x) {
        return 0;
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
        if (n == 0)
            return "a*x";
        return a + "*x^" + n;
    }

    public Expression createInstance() {
        if (a == 0 ) {
            return new ConstExp(0);
        }
        return new MonimialExp(a, n);
    }
}

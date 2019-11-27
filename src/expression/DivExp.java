package expression;

import notation.Notation;

public class DivExp extends BinaryExp {
    @Override
    public double evaluate(int x) {
        double a = expression1.evaluate(x);
        double b = expression2.evaluate(x);
        return doEvaluate(a, b);
    }


    @Override
    double doEvaluate(double val1, double val2) {
        if (val2 == 0) {
            return 0;
        }
        return val1 / val2;
    }

    @Override
    public Expression derive() {
        return super.derive();
    }

    @Override
    public String toString(Notation notation) {
        return super.toString(notation);
    }

    public DivExp(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    String getOperator() {
        return "/";
    }
}

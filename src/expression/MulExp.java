package expression;

public class MulExp extends BinaryExp {
    public MulExp(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    double doEvaluate(double a, double b) {
        return a * b;
    }

    String getOperator() {
        return "*";
    }

    @Override
    public double evaluate(int x) {
        double a = expression1.evaluate(x);
        double b = expression2.evaluate(x);
        return doEvaluate(a, b);
    }
}

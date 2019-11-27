package expression;

public class AddExp extends BinaryExp {

    public AddExp(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    double doEvaluate(double a, double b) {
        return a + b;
    }

    @Override
    public double evaluate(int x) {
        double a = expression1.evaluate(x);
        double b = expression2.evaluate(x);
        return doEvaluate(a, b);
    }

    String getOperator() {
        return "+";
    }

}

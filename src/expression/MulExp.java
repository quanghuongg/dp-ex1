package expression;

public class MulExp extends BinaryExp {
    public MulExp(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    int doEvaluate(int a, int b) {
        return 0;
    }

    String getOperator() {
        return "/";
    }

}

package expression;

import notation.Notation;

public abstract class BinaryExp implements Expression {

    public Expression expression1;
    public Expression expression2;

    @Override
    public double evaluate(int x) {
       return  0;
    }

    @Override
    public Expression derive() {
        return null;
    }

    @Override
    public String toString(Notation notation) {
        String op = getOperator();
        String operand1 = expression1.toString(notation);
        String operand2 = expression2.toString(notation);
        return notation.arrange(op, operand1, operand2);
    }

    public BinaryExp(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    double doEvaluate(double val1, double val2) {
        return 0;
    }

    String getOperator() {
        return null;
    }
}

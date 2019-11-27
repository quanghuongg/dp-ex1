package expression;

import notation.Notation;

public class AddExp extends BinaryExp {

    public AddExp(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    int doEvaluate(int a, int b) {
        return 0;
    }


    String getOperator() {
        return "+";
    }


//    @Override
//    public String toString(Notation notation) {
//        String op = getOperator();
//        String operand1 = expression1.toString(notation);
//        String operand2 = expression2.toString(notation);
//        return notation.arrange(op, operand1, operand2);
//    }
}

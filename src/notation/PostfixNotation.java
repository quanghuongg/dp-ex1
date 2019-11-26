package notation;

public class PostfixNotation implements Notation {
    @Override
    public String arrange(String op, String operand1, String operand2) {
        return operand1 + "" + operand2 + "" + op;
    }
}

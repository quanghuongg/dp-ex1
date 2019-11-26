package notation;

public class InfixNotation implements Notation {
    @Override
    public String arrange(String op, String operand1, String operand2) {
        return "(" + operand1 + "" + op + "" + operand2 + ")";
    }
}

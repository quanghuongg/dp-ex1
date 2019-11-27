package notation;

import utils.NotationUtils;

public class PrefixNotation implements Notation {
    @Override
    public String arrange(String op, String operand1, String operand2) {
        return NotationUtils.infixToPrefix("(" + operand1 + "" + op + "" + operand2 + ")");
    }
}

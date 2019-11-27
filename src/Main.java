import expression.AddExp;
import expression.ConstExp;
import expression.Expression;
import expression.MonimialExp;
import notation.InfixNotation;
import notation.Notation;
import notation.PostfixNotation;
import notation.PrefixNotation;

public class Main {

    public static void main(String[] args) {
        Notation infix = new InfixNotation();
        Notation prefix = new PrefixNotation();
        Notation postfix = new PostfixNotation();

        Expression expression1 = new ConstExp(4);
        System.out.println(expression1.toString(infix));

        Expression expression2 = new MonimialExp(5, 1);
        expression2 = ((MonimialExp) expression2).createInstance();
        System.out.println(expression2.toString(infix));

        Expression expression3 = new AddExp(expression2, expression1);
        System.out.println(expression3.toString(infix));
        System.out.println(expression3.toString(prefix));
        System.out.println(expression3.toString(postfix));

    }
}

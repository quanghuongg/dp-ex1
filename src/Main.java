import expression.*;
import notation.InfixNotation;
import notation.Notation;
import notation.PostfixNotation;
import notation.PrefixNotation;

public class Main {

    public static void main(String[] args) {
        System.out.println("________DEMO________");
        //Init Notation
        Notation infix = new InfixNotation();
        Notation prefix = new PrefixNotation();
        Notation postfix = new PostfixNotation();

        Expression expression1 = new ConstExp(2);
        System.out.println("expression1 ConstExp: " + expression1.toString(infix));
        System.out.println("---------------");

        Expression expression = new MonimialExp(1, 0);
        expression = ((MonimialExp) expression).createInstance();
        System.out.println("expression mono with a= 1, n=0:  " + expression.toString(infix));
        System.out.println("---------------");

        Expression exp = new MonimialExp(0, 4);
        exp = ((MonimialExp) exp).createInstance();
        System.out.println("expression mono with a= 0, n=4:  " + exp.toString(infix));
        System.out.println("---------------");


        Expression expression2 = new MonimialExp(2, 2);
        expression2 = ((MonimialExp) expression2).createInstance();
        System.out.println("expression2:  " + expression2.toString(infix));
        System.out.println("---------------");

        Expression expression3 = new DivExp(expression2, expression1);
        System.out.println("expression3 = expression2 / expression1");
        System.out.println("expression3 infix :  " + expression3.toString(infix));
        System.out.println("expression3 prefix :  " + expression3.toString(prefix));
        System.out.println("expression3 postfix :  " + expression3.toString(postfix));
        System.out.println("value expression3 with x = 10 :  " + expression3.evaluate(10));
        System.out.println("---------------");

        Expression expression4 = new SubExp(expression3, expression2);
        System.out.println("expression4 = expression3 - expression2");
        System.out.println("expression4 infix :  " + expression4.toString(infix));
        System.out.println("value expression4 with x = 2 :  " + expression4.evaluate(2));
        System.out.println("---------------");

        Expression expression5 = new AddExp(expression4, expression3);
        System.out.println("expression5 = expression4 + expression3");
        System.out.println("expression5 infix :  " + expression5.toString(infix));
        System.out.println("value expression5 with x = 2 :  " + expression5.evaluate(2));
        System.out.println("---------------");

        Expression expression6 = new SubExp(expression5, expression4);
        System.out.println("expression6 = expression5 - expression4");
        System.out.println("expression6 infix :  " + expression5.toString(infix));
        System.out.println("value expression6 with x = 1 :  " + expression6.evaluate(1));
        System.out.println("---------------");

    }
}

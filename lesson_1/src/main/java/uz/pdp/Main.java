package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println(new A());



        System.out.println(ge("2 + 3"));
        System.out.println(ge("{1,2,3,4}"));
        System.out.println(ge("{{'a','b'},{'x','y'}}"));

        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext inventorContext = new StandardEvaluationContext();
        System.out.println(parser.parseExpression("'abc'.substring(2, 3)").getValue());
        System.out.println(parser.parseExpression("new uz.pdp.User('Sanjar Chapayev',16)").getValue());

        System.out.println(ge("5 == 5"));
        System.out.println(ge("3 < 0"));
        System.out.println(ge("'white' < 'whete'"));
        System.out.println(ge("!(new uz.pdp.B() instanceof T(uz.pdp.A))"));
        System.out.println(ge("!(new uz.pdp.C() instanceof T(uz.pdp.A))"));
//        System.out.println(ge("d matches '[a-z].'"));
        System.out.println(ge("true and false")); // &&
        System.out.println(ge("true or false")); // ||
        System.out.println(ge("2 + 7"));
        System.out.println(ge("2 - -7"));
        System.out.println(ge("1000.00 - 1e4"));
        System.out.println(ge("5*-6"));
        System.out.println(ge("7%4"));
        System.out.println(ge("7/4"));

//        User user = new User();
//        System.out.println(user.getFullName());


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAutoConfig.class);
        SpELExample bean = context.getBean(SpELExample.class);
        System.out.println("bean: "+bean);

        SpELExample spELExample = new SpELExample();
        System.out.println("object: "+spELExample);
    }

    private static Object ge(String expressionValue) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression(expressionValue);
        return expression.getValue();
    }
}
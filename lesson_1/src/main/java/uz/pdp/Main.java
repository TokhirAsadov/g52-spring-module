package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainApplicationConfig.class);

        Environment environment = (Environment) context.getEnvironment();
        String url = environment.getProperty("spring.datasource.url");
        String database = environment.getProperty("spring.datasource.database");
        String user = environment.getProperty("spring.datasource.user");
        String password = environment.getProperty("spring.datasource.password");
        String schema = environment.getProperty("spring.datasource.schema");
        String driver = environment.getProperty("spring.datasource.driver");
        System.out.println("****************************************");
        System.out.println(url);
        System.out.println(database);
        System.out.println(user);
        System.out.println(password);
        System.out.println(schema);
        System.out.println(driver);
        System.out.println("****************************************");

        MyBean bean = context.getBean(MyBean.class);
        bean.saySomething();

        System.out.println("============================");

        MyBean2 bean2 = context.getBean(MyBean2.class);
        bean2.saySomething2();

        System.out.println("============================");
        Person person = context.getBean(Person.class);
        System.out.println(person);
        Product product = context.getBean(Product.class);
        System.out.println(product);

        context.close();
    }
}
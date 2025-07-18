package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.product.D;

public class Main {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Performance performance = context.getBean(Performance.class);
        A a = context.getBean(A.class);
        a.m1();
        performance.perform();
        performance.hello();

        performance.setCount(10);

        D d = context.getBean(D.class);
        d.d1();


    }
}
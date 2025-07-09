package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.config.MyConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyConfig.class);
        context.refresh();

        MyBean bean = context.getBean(MyBean.class);
        bean.saySomething();

        System.out.println("=================================");

        MyBean2 bean2 = context.getBean(MyBean2.class);
        bean2.saySomething2();
    }
}
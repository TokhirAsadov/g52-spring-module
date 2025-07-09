package uz.pdp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");

        MyBean bean = context.getBean(MyBean.class);
        bean.saySomething();

        System.out.println("==============================");

        MyBean2 bean2 = context.getBean(MyBean2.class);
        bean2.saySomething2();
        System.out.println(bean2);

        context.close();

    }
}
package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
//        User user1 = context.getBean(User.class);
//        System.out.println("before change user1: "+user1);
//        User user2 = context.getBean(User.class);
//        System.out.println("user2: "+user2);
//        System.out.println("======================================");
//        user1.setFullName("Anvar Ganiyev");
//        System.out.println("after change user1: "+user1);
//        System.out.println("user2: "+user2);

        User2 user21 = context.getBean(User2.class);
        User2 user22 = context.getBean(User2.class);
        System.out.println("user2 1: "+user21);
        System.out.println("user2 2: "+user22);
        user21.setAge(88);
        System.out.println("============================");
        System.out.println("user2 1: "+user21);
        System.out.println("user2 2: "+user22);
    }
}
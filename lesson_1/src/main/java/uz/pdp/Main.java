package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {


        // todo -- .xml - config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
//        User user1 = context.getBean(User.class);
//        System.out.println("before change user1: "+user1);
//        User user2 = context.getBean(User.class);
//        System.out.println("user2: "+user2);
//        System.out.println("======================================");
//        user1.setFullName("Anvar Ganiyev");
//        System.out.println("after change user1: "+user1);
//        System.out.println("user2: "+user2);

        //todo --- java - config
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        User2 user31 = context.getBean(User2.class);
//        User2 user32 = context.getBean(User2.class);
//        System.out.println("user2 1: "+user31);
//        System.out.println("user2 2: "+user32);
//        user31.setAge(88);
//        System.out.println("============================");
//        System.out.println("user2 1: "+user31);
//        System.out.println("user2 2: "+user32);

        // todo ---- auto - config
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAutoConfig.class);
//        User3 user31 = context.getBean(User3.class);
//        User3 user32 = context.getBean(User3.class);
//        System.out.println("user3 1: "+ user31);
//        System.out.println("user3 2: "+ user32);
//        user31.setAge(88);
//        System.out.println("============================");
//        System.out.println("user3 1: "+ user31);
//        System.out.println("user3 2: "+ user32);
    }
}
package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
        User user1 = context.getBean(User.class);
        System.out.println("before change user1: "+user1);
        User user2 = context.getBean(User.class);
        System.out.println("user2: "+user2);
        System.out.println("======================================");
        user1.setFullName("Anvar Ganiyev");
        System.out.println("after change user1: "+user1);
        System.out.println("user2: "+user2);
    }
}
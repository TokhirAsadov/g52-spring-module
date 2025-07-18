package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.product.D;
import uz.pdp.project.Card;
import uz.pdp.project.TransactionService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Performance performance = context.getBean(Performance.class);
//        A a = context.getBean(A.class);
//        a.m1();
//        performance.perform();
//        performance.hello();
//
//        performance.setCount(10);
//
//        D d = context.getBean(D.class);
//        d.d1();

        TransactionService transactionService = context.getBean(TransactionService.class);
        Card c1 = new Card(UUID.randomUUID(), 800D);
        Card c2 = new Card(UUID.randomUUID(), 500D);
        transactionService.doTransaction(c1,c2,1400D);

        System.out.println(c1.getBalance());
        System.out.println(c2.getBalance());

    }
}
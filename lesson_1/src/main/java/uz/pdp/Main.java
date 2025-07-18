package uz.pdp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        performance.hello();

    }
}
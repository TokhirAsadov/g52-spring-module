package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.config.AutoConfig;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
//
        Car car = context.getBean(Car.class);
        System.out.println(car);

        User user = context.getBean(User.class);
        System.out.println(user);

        /*
        * Car(name, color, price)
        * init, destroy
        * xml, java, auto config
        * */
    }
}
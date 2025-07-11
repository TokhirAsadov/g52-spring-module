package uz.pdp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public void saySomething(){
        System.out.println("Hello..");
        System.out.println("Spring..");
    }

    @PostConstruct
    public void init(){
        System.out.println(getClass().getName() + " init method.......");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(getClass().getName() + " destroy method.......");
    }
}

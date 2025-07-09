package uz.pdp;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public void saySomething(){
        System.out.println("Hello..");
        System.out.println("Spring..");
    }

}

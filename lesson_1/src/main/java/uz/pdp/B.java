package uz.pdp;

import org.springframework.stereotype.Component;

@Component
public class B {


    void b1(){
        System.out.println("b1 method");
    }

    void b2(String str){
        System.out.println(str+" b2 method..........");
    }

}

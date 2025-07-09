package uz.pdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {

    private MyBean myBean;

    // spring 4.1
    @Autowired
    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }


    public void saySomething2(){
        System.out.println("MyBean2...");
        myBean.saySomething();
    }

}

package uz.pdp;

import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
public class Performance {
    private String name;
    private Integer count;

    public void perform(){

        // Telifonlarimizni ovozini o`chirishimiz kerak
        // Joyimizni topib olishimiz
        System.out.println("Perform Well....");
//        throw new RuntimeException("xatolik....");

        // Qarsak chalamiz
        // Fushtak chalamiz.

    }

    protected String hello(){
        return "Hello Spring AOP";
    }

}

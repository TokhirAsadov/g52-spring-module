package uz.pdp;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
public class User {

    @Value("#{'Ali Valiyev'.substring(0,5)}")
    private String fullName;

    @Value("#{15}")
    private Integer age;

    public User() {
    }

    public User(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void init(){
        System.out.println(getClass().getName()+" ning init() methodi ishladi...............");
    }

    public void destroy(){
        System.out.println(getClass().getName()+" ning destroy() methodi ishladi...............");
    }
}

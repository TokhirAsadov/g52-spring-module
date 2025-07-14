package uz.pdp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
@Scope("singleton")
@Lazy
public class User3 {
    private String fullName = "Valiyev Ali";
    private Integer age = 16;

    public User3() {
    }

    public User3(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @PostConstruct
    public void init(){
        System.out.println(getClass().getName()+" ning init() methodi ishladi...............");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(getClass().getName()+" ning destroy() methodi ishladi...............");
    }
}


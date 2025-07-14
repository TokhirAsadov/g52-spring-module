package uz.pdp;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
@Scope("prototype")
public class User3 {
    private String fullName;
    private Integer age;

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
}


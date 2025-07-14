package uz.pdp;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class User2 {
    private String fullName;
    private Integer age;

    public User2() {
    }

    public User2(String fullName, Integer age) {
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


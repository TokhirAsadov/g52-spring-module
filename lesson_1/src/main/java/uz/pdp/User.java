package uz.pdp;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class User {
    private String fullName;
    private Integer age;

    public User() {
    }

    public User(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void init(){
        System.out.println(getClass().getName()+" ning init() methodi ishladi...............");
    }

    public void destroy(){
        System.out.println(getClass().getName()+" ning destroy() methodi ishladi...............");
    }
}

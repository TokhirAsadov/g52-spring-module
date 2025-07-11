package uz.pdp;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Integer age;

    public Person() {
    }

    public Person(String firstName, String lastName, String username, String password, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

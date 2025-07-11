package uz.pdp;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
public class User {
    private String fullName;
    private Integer age;
    private Car car;

    public User() {
    }

    @Autowired
    public User(Car car) {
        this.car = car;
    }

    public User(String fullName, Car car) {
        this.fullName = fullName;
        this.car = car;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

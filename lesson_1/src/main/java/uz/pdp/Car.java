package uz.pdp;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Component
public class Car {
    private String name;
    private String color;
    private Double price;

    public Car() {
    }

    public Car(String name, String color, Double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

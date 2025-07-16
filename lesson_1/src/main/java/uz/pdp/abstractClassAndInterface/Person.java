package uz.pdp.abstractClassAndInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private String fullName;
    private Integer age;

    public abstract void eat();
    public abstract void saySomething();
}

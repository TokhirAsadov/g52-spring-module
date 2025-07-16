package uz.pdp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class A implements D{

    @Override
    public void walk() {
        System.out.println("walk default method override qilindi");
    }

    @Override
    public void say() {
        System.out.println("sdfsdfsfdfsd");
    }

    @Override
    public void say2() {
        System.out.println("A say2");
    }
}

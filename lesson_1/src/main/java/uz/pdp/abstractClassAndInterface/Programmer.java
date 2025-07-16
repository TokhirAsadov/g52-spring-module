package uz.pdp.abstractClassAndInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Programmer extends Person implements ProgrammerService{
    private String level;


    @Override
    public void eat() {
        System.out.println("Ovqat yeymiz");
    }

    @Override
    public void saySomething() {
        System.out.println("Java buyicha javob beramiz");
    }

    @Override
    public void webDasturTuzish() {
        System.out.println("Web dastur tuzamiz");
    }

    @Override
    public void desktopDasturTuzish() {

    }
}

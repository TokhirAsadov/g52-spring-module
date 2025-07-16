package uz.pdp.abstractClassAndInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends Person implements DoctorService{
    private String mutaxasisligi;

    @Override
    public void eat() {
        System.out.println("ovqat yeyishadi");
    }

    @Override
    public void saySomething() {
        System.out.println("dorilar haqida gapirishadi");
    }


    @Override
    public void bemorlarniKurish() {
        System.out.println("bemorlarni kasalliklarini aniqlashadi");
    }

    @Override
    public void doriYozibBerish() {

    }
}

package uz.pdp;

import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
public class MyBean2 {

    @Getter
    private List<String> colors;
    // Set<String>

    @Getter
    private Map<Integer,String> courses;

    private MyBean myBean;

    public MyBean2(MyBean myBean5){
        this.myBean = myBean5;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setCourses(Map<Integer, String> courses) {
        this.courses = courses;
    }

    public void saySomething2(){
        System.out.println("MyBean2...");
        myBean.saySomething();
    }

}

package uz.pdp;

public class MyBean2 {

    private MyBean myBean;

    public MyBean2(MyBean myBean5){
        this.myBean = myBean5;
    }

    public void saySomething2(){
        System.out.println("MyBean2...");
        myBean.saySomething();
    }

}

package uz.pdp;

public interface D {
    int NUM = 10;

    void say();
    void say2();

    default void walk(){
        System.out.println("bu java 8 da qushilgan. default method");
        pMethod();
    };

    static void sMehtod(){

    }

    private void pMethod(){
        System.out.println("private method java 9");
    }
}

public class Interfaces {
    
}

interface Demo{
    public static final int a= 101;
    public static void m1(){
        System.out.println("interface method");
    }
    public void m2();
    default void m3(){
        System.out.println("default method");
    }
}

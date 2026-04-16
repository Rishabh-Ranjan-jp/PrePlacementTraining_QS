public class UpCastingDemo {
    public static void main(String[] args) {
        Book p1 = new Pen();
        p1.m1();
        System.out.println(p1.a);
        System.out.println(p1.b);
        // System.out.println(p1.c); the vars and methods in pen class is not accessible.
    }    
}
class Book{
    int a = 10;
    int b = 20;

    void m1(){
        System.out.println("parent method");
    }
}

class Pen extends Book{
    int c = 30;
    int d = 40;

    void m2(){
        System.out.println("child method");
    }
}
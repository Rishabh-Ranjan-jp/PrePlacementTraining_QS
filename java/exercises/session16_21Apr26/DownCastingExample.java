public class DownCastingExample {
    public static void main(String[] args) {
        Book book1 = new Pen();
        Pen pen1 = (Pen) book1;

        System.out.println("All the attributes and methods accessible through downcasting: ");
        System.out.println(String.format("%d %d %d %d",pen1.a, pen1.b, pen1.c, pen1.d) );
        pen1.method1();
        pen1.method2();
        
        System.out.println("All the attributes and methods accessible through upcasting.: ");
        System.out.println(String.format("%d %d", book1.a, book1.b));
        book1.method1();
    }
}

class Book{
    int a = 10;
    int b = 20;

    void method1(){
        System.out.println("Printing hello from parent method");
    }
}

class Pen extends Book{
    int c = 30;
    int d = 40;

    void method2(){
        System.out.println("Printing hello from child method");
    }
}
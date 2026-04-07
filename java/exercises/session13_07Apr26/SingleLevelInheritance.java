public class SingleLevelInheritance {
    public static void main(String[] args) {
        Child one = new Child();
        System.out.println(one.a + one.b + one.c + one.d);
        one.method1();
        one.method2();
        one.method3();
        one.method4();
    }
}

class Parent{
    int a = 10;
    int b = 20;
    
    public void method1(){
        System.out.println("Printing from parent method1");
    }

    public void method2(){
        System.out.println("Printing from parent method2");
    }
}

class Child extends Parent{
    int c = 30;
    int d = 40;

    public void method3(){
        System.out.println("Printing from child method3");
    }

    public void method4(){
        System.out.println("Printing from child method4");
    }
}
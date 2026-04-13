public class InheritanceInitializerTest {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

class Parent{
    {
        System.out.println("Parent says hello!");
    }
    Parent(){
        System.out.println("Parent constructor says hello!");
    }
}

class Child extends Parent{
    {
        System.out.println("Child says hello!");
    }

    Child(){
        super();
        System.out.println("Child constructor says hello!");
        
    }
}
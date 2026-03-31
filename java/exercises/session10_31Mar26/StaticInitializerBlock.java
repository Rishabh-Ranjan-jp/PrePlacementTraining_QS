public class StaticInitializerBlock {
    public static void main(String[] args) {
        StaticInitializerDemo k = new StaticInitializerDemo();    
    }
}

class StaticInitializerDemo{
    
    {
        System.out.println("This is the non static initializer");
    }
    static{
        System.out.println("This is the static initializer");
    }

}
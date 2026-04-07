public class CombinationOfStaticNonStatic {
    public static void main(String[] args) {
        CombinationClass.staticMethod();
        CombinationClass instance = new CombinationClass();
        instance.nonStaticMethod();
    }
}

class CombinationClass{
    {
        System.out.println("Non-static initializer block");
    }
    static{
        System.out.println("Static initializer block");
    }
    CombinationClass(){
        System.out.println("This is the constructor");
    }
    static void staticMethod(){
        System.out.println("Static method");
    }
    void nonStaticMethod(){
        System.out.println("Non-static method");
    }
}
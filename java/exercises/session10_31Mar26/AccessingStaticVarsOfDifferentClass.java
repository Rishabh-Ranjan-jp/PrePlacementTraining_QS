public class AccessingStaticVarsOfDifferentClass {
    public static void main(String[] args) {
        System.out.println(DifferentClass.a);
        System.out.println(DifferentClass.b);
        System.out.println(DifferentClass.c);
    }
}


class DifferentClass{
    static int a = 111;
    static int b = 222;
    static int c = 333;
}
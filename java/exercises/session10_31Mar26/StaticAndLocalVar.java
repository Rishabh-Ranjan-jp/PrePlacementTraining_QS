public class StaticAndLocalVar {
    static int x = 10;

    public static void main(String[] args) {
        int x = 2;
        System.out.println("Local variable: "+x);
        System.out.println("Static variable: "+StaticAndLocalVar.x);
    }
}

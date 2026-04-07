import java.util.Scanner;

public class AddUsingScanner {
    public static void add(int a, int b){
        System.out.println("The sum is "+(a+b));
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        add(a, b);
        System.out.println("Enter a boolean: ");
        boolean c = s.nextBoolean();
        System.out.println("Enter a double precision type number: ");
        double d = s.nextDouble();
        System.out.println("Enter a string: ");
        String e = s.next();
        System.out.println(String.format("The boolean: %b | The double: %.2f | The string: %s", c, d, e));
    }
}

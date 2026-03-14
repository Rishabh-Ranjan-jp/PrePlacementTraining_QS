package solutions;

public class ProductofNums{
    public static void run(){
        int n = 5;
        int prod = 1;
        for(int i = 2; i<=n; i++)
            prod *= i;
        System.out.println(String.format("Product of numbers from 1 to 5, or 5! = %d",prod));
    }
}
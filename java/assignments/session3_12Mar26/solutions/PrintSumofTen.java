package solutions;

public class PrintSumofTen{
    public static void run(){
        int n = 11;
        System.out.print("Sum of number from 1 to 10 is ");
        int sum = 0;
        for(int i = 1; i<n; i++){
            sum += i;
        }
        System.out.print(sum);
        System.out.println();
    }
}
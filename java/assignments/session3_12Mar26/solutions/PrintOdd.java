package solutions;

public class PrintOdd{
    public static void run(){
        System.out.print("Odd numbers between 1 and 20: ");
        for(int i = 1; i<21; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
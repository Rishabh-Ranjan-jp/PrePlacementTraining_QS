package solutions;

public class PrintUppercase{
    public static void run(){
        char i = 'A';
        char j = 'Z';
        System.out.println("Printing alpabeets from A to Z horizontally: ");
        for(;i<=j;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
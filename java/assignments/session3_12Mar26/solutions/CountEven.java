package solutions;

public class CountEven{
    public static void run(){
        int count = 0;
        for(int i = 2; i<101; i+=2)
            count++;
        System.out.println("Number of even numbers between 1 to 100 is: "+count);
    }
}
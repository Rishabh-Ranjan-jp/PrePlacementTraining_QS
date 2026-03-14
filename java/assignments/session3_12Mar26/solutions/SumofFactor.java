package solutions;

public class SumofFactor{
    public static void run(){
        int i = 10;
        int upper = 71;
        int divisor = 7;
        int sum = 0;
        while(i<upper){
            if(i%divisor == 0)
                sum += i;
            i++;
        }
        System.out.println("Sum of numbers divisible by 7 between 10 and 70: "+sum);
    }
}
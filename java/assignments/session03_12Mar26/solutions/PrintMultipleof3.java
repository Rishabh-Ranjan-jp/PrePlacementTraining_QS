package solutions;

public class PrintMultipleof3{
    public static void run(){
        int factor = 3;
        System.out.println("Numbers divisible by 3 in the range 10 to 60 are: ");
        for(int i = 10; i<61; i++){
            if(i%factor == 0)
                System.out.print(i+ " ");
        }
        System.out.println();

    }
}
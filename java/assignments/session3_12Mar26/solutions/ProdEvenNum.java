package solutions;

public class ProdEvenNum{
    public static void run(){
        int prod = 1;
        int factor = 2;
        int i = 1;
        int upper = 11;
        while(i<upper){
            prod = i%2 == 0 ? prod*i : prod;
            i++;
        }
        System.out.println("Product of numbers divisible by 2 between 1 and 10 "+prod);
    }
}
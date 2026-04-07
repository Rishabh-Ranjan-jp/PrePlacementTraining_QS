import java.util.Scanner;

class FactorialCalc{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 2; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args){
        System.out.println(String.format("5! = %d",factorial(5)));        
    }
}
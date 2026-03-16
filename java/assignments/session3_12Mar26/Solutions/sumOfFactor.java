class sumOfFactor{
    public static void main(String[] args){
        int i = 10;
        int upper = 71;
        int divisor = 7;
        int sum = 0;
        while(i<upper){
            if(i%divisor == 0)
                sum++;
            i++;
        }
        System.out.println("Sum of numbers divisible between 10 and 70: "+sum);
    }
}
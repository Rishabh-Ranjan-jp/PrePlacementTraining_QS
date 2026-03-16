class printMultiplesof2_10{
    public static void main(String[] args){
        int lowerLimit = 30;
        int upperLimit = 101;
        System.out.print("All the numbers divisible by 2 and 5: ");
        for(int i = lowerLimit; i<upperLimit; i++){
            if(i%10 == 0) // or we could be smarter and just do a simpler check i%2 == 0 && i%5 == 0, since we need numbers that are divisible by both.
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
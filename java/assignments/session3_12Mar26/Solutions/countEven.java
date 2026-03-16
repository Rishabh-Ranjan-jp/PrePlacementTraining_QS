class countEven{
    public static void main(String[] args){
        int count = 0;
        for(int i = 2; i<101; i+=2)
            count++;
        System.out.println("Number of even numbers between 1 to 100 is: "+count);
    }
}
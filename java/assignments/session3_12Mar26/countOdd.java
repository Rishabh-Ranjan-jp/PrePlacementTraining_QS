class countOdd{
    public static void main(String[] args){
        int count = 0;
        for(int i = 1; i<101; i+=2)
            count++;
        System.out.println("Number of odd numbers betwen 1 to 100 is: "+count);
    }
}
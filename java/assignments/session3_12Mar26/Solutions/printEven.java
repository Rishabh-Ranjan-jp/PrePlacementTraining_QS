class printEven{
    public static void main(String[] args){
        System.out.print("Even numbers between 1 to 20: ");
        for(int i = 1; i<21; i++){ //could just start at 2, and then put i+=2 and print without checking as well.
            if(i%2 == 0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}
class print2Table{
    public static void main(String[] args){
        int i = 1;
        System.out.println("Printing 2's table: ");
        while(i<11){
            System.out.println(String.format("%d x %d = %d", 2, i, 2*i));
            i++;
        }
    }
}
package solutions;

public class PrintTables{
    public static void run(){
        for(int i = 1; i<4; i++){
            System.out.println("Printing the table of "+i);
            int j = 1;
            do{
                System.out.println(String.format("%d x %d = %d",i,j,i*j));
                j++;
            }while(j<11);
        }
    }
}
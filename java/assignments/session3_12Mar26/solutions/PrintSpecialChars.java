package solutions;

public class PrintSpecialChars{
    public static void run(){
        //I think most of the special chars are between 37, 48 ascii values
        System.out.println("Printing some of the special characters: ");
        for(int i = 37; i<48; i++){
            System.out.print((char)i+ " ");
            //Important note, here, just like in c, typecasting happenes like this: (type) value and not type(value) like in py
        }
        System.out.println();
    }
}
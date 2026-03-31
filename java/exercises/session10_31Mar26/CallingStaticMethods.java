public class CallingStaticMethods {
    
    public static void sub(){
        System.out.println("10 - 10 = "+(10-10));
    }
    
    public static void main(String[] args) {
        // calling static method of another class `StaticMethod`
        StaticMethods.add();
        // calling static method of this class
        sub(); 
    }
}


class StaticMethods{
    public static void add(){
        System.out.println("10 + 10 = "+(10+10));
    }
}
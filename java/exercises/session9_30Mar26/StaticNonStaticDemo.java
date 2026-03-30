public class StaticNonStaticDemo {
    
    int i = 1;
    static int j= 3;
    
    public static void main(String[] args) {
        StaticNonStaticDemo x = new StaticNonStaticDemo();
        x.demo();
    }    

    void demo(){
        System.out.println(i);
        System.out.println(j);
    }
}

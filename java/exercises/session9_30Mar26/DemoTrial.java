public class DemoTrial {
    public static void main(String[] args) {
        Demo obj = new Demo();
        
    }
}

class Demo{
    Demo(){
        this(10); // used to call the parameterized constructor.
        System.out.println("From no args constructor");
    }
    Demo(int i){
        System.out.println("From paranmeterized constructor");
    }
}
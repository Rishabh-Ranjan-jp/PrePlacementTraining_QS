public class InitializerBlock {

    public static void main(String[] args) {
        System.out.println("Starting main now");
        Initializer k = new Initializer();
        System.out.println("Ending main now");
    }
}

class Initializer{
    {
        int x = 10;
        int y = 20;
        System.out.println("Initialized "+x+" "+y);
        System.out.println("FinalValue: "+Math.random()*(x+y));
    }
    {
        System.out.println("suh");
    }
    Initializer(){
        System.out.println("Just ran the constructor now.");
    }
}



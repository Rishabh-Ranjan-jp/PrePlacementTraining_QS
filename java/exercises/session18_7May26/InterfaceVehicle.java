public class InterfaceVehicle {
    public static void main(String[] args) {
        Car x = new Car();
        x.start();
    }
}
interface Vehicle{
    void start();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
}
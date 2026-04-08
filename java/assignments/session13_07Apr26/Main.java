import solutions.*;

public class Main{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Q2: Create a class shape, create a subclass circle that overrides the area method to calculate circle area.");
        Circle x = new Circle(2.71);
        x.area();

        System.out.println();
        System.out.println("Q3: Create a class vehicle with speed, showSpeed(), and create a subclass brand, displayCar()");
        Car y = new Car("Model i");
        y.displayCar();
        y.showSpeed();

    }
}
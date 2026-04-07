public class CarDemo {
    public static void main(String[] args){
        Car[] cars = {
            new Car("Mercedes", "Black", 10000000),
            new Car("Benz", "Blue", 1234111)
        };
        System.out.println();
        for(Car x: cars){
            x.display();
            x.drive();
            x.decelerate();
            System.out.println(x);
        }
    }
}

class Car{
    private String brand;
    private String color;
    private int price;

    Car(
        String brand, 
        String color, 
        int price
    ){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void drive(){
        System.out.println("Car is driving");
    }

    void decelerate(){
        System.out.println("Car is breaking");
    }

    void display(){
        System.out.println(String.format("%s color car is of %s brand, and priced at %d rupees", this.color, this.brand, this.price));
    }
}
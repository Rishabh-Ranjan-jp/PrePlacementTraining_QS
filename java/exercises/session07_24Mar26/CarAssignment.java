public class CarAssignment {
    public static void main(String[] args){
        Car[] cars = {
            new Car("Maruti Suzuki", "Swift", "Petrol", 700000),
            new Car("Tata", "Nexon", "Diesel", 1000000),
            new Car("Mahindra", "Thar", "Diesel", 1500000)
        };

        for(Car x: cars){
            x.display();
            x.drive();
            x.startCar();
            x.drive();
            x.startCar();
        }
    }
}


class Car{
    private String brand, model, fuelType;
    private int price;
    private boolean started = false;

    Car(
        String brand,
        String model, 
        String fuelType,
        int price
    ){
        this.price = price;
        this.fuelType = fuelType;
        this.model = model;
        this.brand = brand;
    }

    void startCar(){
        if(!started){
        System.out.println("Starting Car now...");
        started = true;
        }else{
            System.out.println("Car already started...");
        }
    }

    void drive(){
        if(started)
            System.out.println("Driving now");
        else
            System.out.println("Start the Car first.");
    }

    void display(){
        System.out.println(String.format("Brand: %s | Model: %s | Price: %d | FuelType: %s", this.brand, this.model, this.price, this.fuelType));
    }
}
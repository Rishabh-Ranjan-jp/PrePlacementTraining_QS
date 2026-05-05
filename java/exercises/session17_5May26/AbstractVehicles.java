public class AbstractVehicles {
    public static void main(String[] args) {
        Vehicle[] list = {
            new Car(),
            new Bike()
        };
        for(Vehicle x: list){
            x.fuelType();
            x.run();
            System.out.println();
        }
    }
}

abstract class Vehicle{
    abstract void run();

    void fuelType(){
        System.out.println("FuelType > : Petrol");
    }
}

class Car extends Vehicle{
    void run(){
        System.out.println("Driving car now.");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Riding bike now.");
    }
}
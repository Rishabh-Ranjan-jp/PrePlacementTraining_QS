public class VehicleOverride {
    public static void main(String[] args) {
        Vehicle[] list = {
            new Vehicle(),
            new Car(),
            new Bike()
        };

        for (Vehicle v: list){
            v.run();
        }
    }
}

class Vehicle{
    void run(){
        System.out.println("The vehicle is running.");
    }
}

class Car extends Vehicle{
    void run(){
        System.out.println("The car is running");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("The bike is running");
    }
}
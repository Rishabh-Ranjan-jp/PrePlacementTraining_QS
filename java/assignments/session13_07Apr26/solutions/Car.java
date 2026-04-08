package solutions;

public class Car extends Vehicle{
    String brand;

    public void displayCar(){
        System.out.println("Car is of "+brand+" brand and current speed is: "+getSpeed());
    }

    public Car(String brand){
        this.brand = brand;
    }
}

class Vehicle{
    protected double speed = -1;
    
    public void showSpeed(){
        System.out.println("The speed is: "+speed);
    }

    public void setSpeed(double currentSpeed){
        this.speed = currentSpeed;
    }

    public double getSpeed(){
        if(speed == -1)
            setSpeed(30); //default speed
        return speed;
    }
}
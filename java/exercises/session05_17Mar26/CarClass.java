class CarClass{
    public static void main(String[] args){
        Car car1 = new Car();

        System.out.println(car1.decelerate());
        System.out.println(car1.accelerate());
        System.out.println(car1.accelerate());
        System.out.println(car1.decelerate());
    }
}

class Car{
    
    String brand = "Mahindra";
    int windows = 4;
    int seats = 4;
    private boolean accelerating = false; 

    public String accelerate(){
        if (!accelerating){
            accelerating = true;
            return "Accelerating now...";
        }else{
            return "Already accelerating...";
        }
    }

    public String decelerate(){
        if (accelerating){
            accelerating = false;
            return "Decelerating now...";
        }else{
            return "Already decelerating...";
        }
    }

}
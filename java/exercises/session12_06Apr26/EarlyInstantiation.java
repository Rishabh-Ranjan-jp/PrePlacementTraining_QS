public class EarlyInstantiation {
    public static void main(String[] args) {
        Car x = new Car();
        System.out.println("Car tyres: ");
        for(Tyre t: x.tyres){
            System.out.println(t.getBrand());
        }
    }
}

class Tyre{
    private String brand;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    Tyre(){
        System.out.println("Initialized a tyre. Set brand name manually.");
    }

    Tyre(String brand){
        setBrand(brand);
    }
}

class Car{
    //This is early instantiation.
    Tyre[] tyres = {
        new Tyre("Appolo"),
        new Tyre("MRF"),
        new Tyre("Appolo"),
        new Tyre("MRF")
    };
}
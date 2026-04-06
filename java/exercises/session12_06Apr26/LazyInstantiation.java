public class LazyInstantiation {
    public static void main(String[] args) {
        Car x = new Car();

        System.out.println("Car tyres: ");
        for(int i = 0; i<x.getNumberOfTyres(); i++){
            System.out.println("Brand of tyre "+(i+1)+" is "+x.getTyre(i));
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
    private String model;
    private Tyre[] tyres = new Tyre[4];

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setTyre(int index, Tyre tyre){
        this.tyres[index] = tyre;
    }

    public String getTyre(int index){
        if(tyres[index] == null){
            setTyre(index, new Tyre("Default Brand"));
            System.out.println("Lazily assigned tyre "+(index+1)+" brand.");
        }
        return tyres[index].getBrand();
    }

    public int getNumberOfTyres(){
        return tyres.length;
    }
}
public class CarRelationship {
    public static void main(String[] args) {
        Car x = new Car();
        System.out.println("Car Model:"+ x.getModelName());
        x.setModelName("Model K");
        System.out.println("Car Model:"+ x.getModelName());
        System.out.println("Current Horsepower: "+x.getEngine().getHorsePower());
        x.setEngine(100);
        System.out.println("Current Horsepower: "+x.getEngine().getHorsePower());
    }
}

class Car{
    private String modelName;
    private Engine engine = new Engine();

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(int horsePower){
        engine.setHorsePower(horsePower);
    }

    public Car(){
        System.out.println("Car has been created. Set the modelname.");
    }

    public Car(String modelName){
        setModelName(modelName);
    }

}

class Engine{
    private int horsePower;

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public Engine(){
        System.out.println("Created engine with unmarked horsepower.");
    }

    public Engine(int horsePower){
        setHorsePower(horsePower);
    }
}
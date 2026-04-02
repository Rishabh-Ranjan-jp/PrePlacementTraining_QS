package solutions;

public class Car {
    private String model;
    private String date;
    private String color;
    private String brand;

    public void setModel(String model) {
        this.model = model;
        System.out.println("Model of the car has been set to: "+getModel());
    }
    public String getModel() {
        return model;
    }

    public void setDate(String date) {
        this.date = date;
        System.out.println("Date of the car has been set to: "+getDate());
    }
    public String getDate() {
        return date;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color of the car has been set to: "+getColor());
    }
    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Brand of the car has been set to: "+getBrand());
    }
    public String getBrand() {
        return brand;
    }
}

package solutions;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void area(){
        double area = radius * radius * (22/7);
        System.out.println("Raidus of circle: "+this.radius+" | Area of circle: "+area);
    }
}

class Shape{
    void area(){
        System.out.println("This method must be overriden by the child class to provide implementation.");
    }
}
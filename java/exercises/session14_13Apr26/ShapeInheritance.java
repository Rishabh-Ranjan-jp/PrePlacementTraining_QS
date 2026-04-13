public class ShapeInheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.calculateArea();
        Square square1 = new Square(10);
        square1.calculateArea();
        Rectangle rectangle1 = new Rectangle(10, 20);
        rectangle1.calculateArea();
        Circle circle1 = new Circle(10);
        circle1.calculateArea();
    }
}
class Shape{
    void calculateArea(){
        System.out.println("implement the functionality.");
    }
}
class Square extends Shape{
    int length;

    Square(int length){
        this.length = length;
    }

    void calculateArea(){
        int area = length * length;
        System.out.println("Area of square "+area);
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void calculateArea(){
        double area = (22.0/7)*radius*radius;
        System.out.println("Area of Circle "+area);
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea(){
        int area = length * breadth;
        System.out.println("Area of rectangle "+area);
    }
}
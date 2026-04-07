public class BoxNSHandler {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.length = 10;
        box1.breadth = 20;
        System.out.println("Area of the box is "+box1.calculateArea());
    }
}

class Box{
    double length, breadth, area;

    double calculateArea(){
        return length*breadth;
    }
}
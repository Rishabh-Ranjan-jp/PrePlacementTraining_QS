public class BoxHandler {
    public static void main(String[] args) {
        System.out.println();
        Box box1 = new Box();
        System.out.println();
        Box box2 = new Box(10,11, 1100);
    }
}

class Box{
    double length, breadth, area;

    Box(){
        System.out.println("Box is ready to be initialized");
    }

    Box(double length){
        this();
        this.length = length;
        System.out.println("Length has been initialized");
    }

    Box(double length, double breadth){
        this(length);
        this.breadth = breadth;
        System.out.println("Breadth has been initialized");
    }

    Box(double length, double breadth, double area){
        this(length, breadth);
        this.area = area;
        System.out.println("Area has been initialized");
    }
}

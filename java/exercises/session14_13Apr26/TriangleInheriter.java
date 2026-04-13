public class TriangleInheriter {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.computeArea();
        Triangle triangle1 = new Triangle();
        triangle1.computeArea(2,3,4);
        RightAngledTriangle rightTriangle1 = new RightAngledTriangle();
        rightTriangle1.computeArea(2,3);
    }
}
class Shape{
    void computeArea(){
        System.out.println("Override this to actually calculate the area.");
    }
}

class Triangle extends Shape{
    void computeArea(double a, double b, double c){
        double semi = (a+b+c)/2;
        double area = Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
        System.out.println("Area of the triangle is: "+area);
    }
}

class RightAngledTriangle extends Triangle{
    void computeArea(double base, double height){
        double area = base*height/2;
        System.out.println("Area of the right angled triangle is: "+area);
    }
}
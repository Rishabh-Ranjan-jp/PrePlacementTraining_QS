public class RectangleDemo {
    public static void main(String[] args){
        Rectangle[] rectangles = {
            new Rectangle(10, 20),
            new Rectangle(1, 2),
            new Rectangle(22,9)
        };
        System.out.println();
        for(Rectangle x: rectangles){
            x.display();
            System.out.println("Area of Rectangle: "+x.calArea());
            System.out.println("Perimeter of Rectangle: "+x.calPerimeter());
            System.out.println("Area of Rectangle(parameterized): "+x.parameterizedCalArea(x.length, x.breadth));
            System.out.println("Perimeter of Rectangle(parameterized): "+x.parameterizedCalPerimeter(x.length, x.breadth));
            System.out.println();
        }
    }
}


class Rectangle{
    int length;
    int breadth;

    Rectangle(
        int length,
        int breadth
    ){
        this.length = length;
        this.breadth = breadth;
    }

    int calArea(){
        return this.length * this.breadth;
    }

    int calPerimeter(){
        return 2*(this.length + this.breadth);
    }

    void display(){
        System.out.println(String.format("Rectangle Length: %d | Rectange Breadth: %d", this.length, this.breadth));
    }

    int parameterizedCalArea(int length, int breadth){
        return length*breadth;
    }

    int parameterizedCalPerimeter(int length, int breadth){
        return 2*(length + breadth);
    }
}
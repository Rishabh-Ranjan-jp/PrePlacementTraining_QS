Trainer: Rohit Kumar | Java [FN: 0930 - 1230]

---

### Creating Objects

To create new objects, we use: 

```java
ClassName referenceVariable = new ClassName();
```

For example: 

```java
Car car1 = new Car();
Bike bike1 = new Bike();
```

#### `new` Operator

It is a keyword and new is also a unary operator.

> It creates a block of memory in the heap, and then returns the address of the block.

#### Constructors

> The **Constructor** is used to load and initialise the non static members of a class.

#### reference Variable

> **referenceVariable** stores the reference to the memory block created by the class (also known as *objectVariable*).

Note that printing an object directly, ie printing the reference variable directlty prints the address:

```java
Car x = new Car();
System.out.println(x);
```

Ouput: 

```bash
Car@49476842
```

#### Multiple references pointing to Single Object

```java
class Pen{
    string penBrand;
}

Pen p1 = new Pen();
Pen p2 = p1;


System.out.println(p1);
System.out.println(p2);
System.out.println(new Pen());
```

Both of these, p1, p2 will have the exact same output, since p1 is pointing to a block of memory, and p2 is also pointing to the same block of memory since they are both reference variables. 

And ofcourse, the third print statement will printout a different address entirely, since a new block of memory is created and its address is returned by `new`.

---

#### Code exercise

1. Create a Student object with the following methods and properties: 
   
   ```java
   /*
   attributes: 
       student id
       student name
       student age
   methods:
       studying()
       coding()
   */
   ```
   
   ```java
   class Student {
       private int id;
       private String name;
       private int age;
   
       Student(){};
   
       Student(
           int id,
           String name, 
           int age
       ){
           this.id = id;
           this.name = name;
           this.age = age;
       }
   
       void studying(){
           System.out.println(String.format("Student Name: %s, ID: %d is studying.",this.name, this.id));
       }
   
       void coding(){
           System.out.println(String.format("Student Name: %s, ID: %d is coding.",this.name, this.id));
   
       }
       void display(){
           System.out.println(String.format("Student Name: %s | Student ID: %d | Student Age: %d.",this.name, this.id, this.age));
   
       }
   }
   
   public class StudentDemo{
       public static void main(String[] args){ 
           Student s1 = new Student(1, "adam", 20);
           s1.display();
           s1.coding();
           s1.studying(); 
           Student s2 = new Student(2, "James", 21);
           Student s3 = new Student(3, "Eve",20); 
           Student[] group = {s2, s3}; 
           for(Student x: group){
               System.out.println();
               x.display();
               x.coding();
               x.studying();
               System.out.println(); 
           }
        }
   }
   ```
   
   output: 
   
   ```bash
   Student Name: adam | Student ID: 1 | Student Age: 20.
   Student Name: adam, ID: 1 is coding.
   Student Name: adam, ID: 1 is studying. 
   Student Name: James | Student ID: 2 | Student Age: 21.
   Student Name: James, ID: 2 is coding.
   Student Name: James, ID: 2 is studying. 
   Student Name: Eve | Student ID: 3 | Student Age: 20.
   Student Name: Eve, ID: 3 is coding.
   Student Name: Eve, ID: 3 is studying.
   ```

2. Create a car class with some attributes and methods, and instantiate two objects.
   
   ```java
   public class CarDemo {
       public static void main(String[] args){
           Car[] cars = {
               new Car("Mercedes", "Black", 10000000),
               new Car("Benz", "Blue", 1234111)
           };
           System.out.println();
           for(Car x: cars){
               x.display();
               x.drive();
               x.decelerate();
               System.out.println();
           }
       }
   }
   
   class Car{
       private String brand;
       private String color;
       private int price;
   
       Car(
           String brand, 
           String color, 
           int price
       ){
           this.brand = brand;
           this.color = color;
           this.price = price;
       }
   
       void drive(){
           System.out.println("Car is driving");
       }
   
       void decelerate(){
           System.out.println("Car is breaking");
       }
   
       void display(){
           System.out.println(String.format("%s color car is of %s brand, and priced at %d rupees", this.color, this.brand, this.price));
       }
   }
   ```
   
   output: 
   
   ```bash
   Black color car is of Mercedes brand, and priced at 10000000 rupees
   Car is driving
   Car is breaking
   
   Blue color car is of Benz brand, and priced at 1234111 rupees
   Car is driving
   Car is breaking
   ```

3. Create  a rectangle class with length, breadth and methods to calculate area and perimeter
   
   ```java
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
        Rectangle{
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
   ```
   
   output: 
   
   ```bash
   Rectangle Length: 10 | Rectange Breadth: 20
   Area of Rectangle: 200
   Perimeter of Rectangle: 60
   Area of Rectangle(parameterized): 200
   Perimeter of Rectangle(parameterized): 60
   
   Rectangle Length: 1 | Rectange Breadth: 2
   Area of Rectangle: 2
   Perimeter of Rectangle: 6
   Area of Rectangle(parameterized): 2
   Perimeter of Rectangle(parameterized): 6
   
   Rectangle Length: 22 | Rectange Breadth: 9
   Area of Rectangle: 198
   Perimeter of Rectangle: 62
   Area of Rectangle(parameterized): 198
   Perimeter of Rectangle(parameterized): 62
   ```

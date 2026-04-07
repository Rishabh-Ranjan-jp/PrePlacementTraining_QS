Trainer: Pavan Kumar | Java [AN: 1315 - 1600]

---

### More on objects, example problems on basic classes and objects

Consider the code snippet: 

```java
class Demo{
    public static void main(String[] args){
        X a = null;
        System.out.println(a);
        a = new X();
        System.out.println(a);
    }
}


class X{
    int x = 10;
}
```

output: 

```bash
null
X@6ff3c5b5
```

Here, something to note is that the actual address is whatever that comes after the `@` symbol. When packages are involved, the addresses are written in the format: `package.classname@address`.



Consider the following snippet:

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = s1;
Studetn s4 = s2;
```

Here, there are really only **2** objects. s3 and s4 are just new references to the existing objects.



Also, note that you can only access an object or the data stored inside it through: 

- Reference/address of the object

- Name of the properties and/or methods



### Scanner class

> Exists in the `java.util` package and is used to provide input to the program as a user.

To use the scanner class' methods:

```java
//import the package
import java.util.Scanner;

//instantiate inside the the class:
Scanner s = new Scanner(System.in);
```

In order to read and store the input from the user, scanner uses `scanner.next<Dtype>()`. For example: 

```java
s.nextInt();
s.nextBoolean();
s.next(); //for strings
s.nextDouble(); 
//and so on...
```



---

#### Code exercise

1. Make a simple student class that stores name, id, course, marks and implements display stats and calculate grade methods.
   
   ```java
   public class StudentAssignment {
       public static void main(String[] args){
           Student s1 = new Student(1, "Adam", "Programming in C", 91);
           Student s2 = new Student(2, "Jason", "AI", 65);
           Student s3 = new Student(3, "Evelyn", "Discrete Math", 50);
   
       
           s1.displayStudentDetails();
           System.out.println("Grade: "+s1.calculateGrade());
           s2.displayStudentDetails();
           System.out.println("Grade: "+s2.calculateGrade());
           s3.displayStudentDetails();
           System.out.println("Grade: "+s3.calculateGrade());
   
       }
   }
   
   class Student{
       private int studentId;
       private String name;
       private String course;
       private int marks;
   
       Student(
           int studentId, 
           String name, 
           String course, 
           int marks
       ){
           this.marks = marks;
           this.name = name;
           this.studentId = studentId;
           this.course = course;
       }
   
       void displayStudentDetails(){
           System.out.println(String.format("Student ID: %d | Student Name: %s | Course: %s | Marks: %d", this.studentId, this.name, this.course, this.marks));
       }
   
       String calculateGrade(){
           if(this.marks > 80)
               return "A";
           else if(this.marks > 60)
               return "B";
           else
               return "F";
       }
   
   }
   
   ```
   
   output: 
   
   ```bash
   Student ID: 1 | Student Name: Adam | Course: Programming in C | Marks: 91
   Grade: A
   Student ID: 2 | Student Name: Jason | Course: AI | Marks: 65
   Grade: B
   Student ID: 3 | Student Name: Evelyn | Course: Discrete Math | Marks: 50
   Grade: F
   ```

2. Make a Car class and instantiate cars with brand, model, fuel type, price as the attribues and startcar, drive as methods.
   
   ```java
   public class CarAssignment {
       public static void main(String[] args){
           Car[] cars = {
               new Car("Maruti Suzuki", "Swift", "Petrol", 700000),
               new Car("Tata", "Nexon", "Diesel", 1000000),
               new Car("Mahindra", "Thar", "Diesel", 1500000)
           };
   
           for(Car x: cars){
               x.display();
               x.drive();
               x.startCar();
               x.drive();
               x.startCar();
           }
       }
   }
   
   
   class Car{
       private String brand, model, fuelType;
       private int price;
       private boolean started = false;
   
       Car(
           String brand,
           String model, 
           String fuelType,
           int price
       ){
           this.price = price;
           this.fuelType = fuelType;
           this.model = model;
           this.brand = brand;
       }
   
       void startCar(){
           if(!started){
           System.out.println("Starting Car now...");
           started = true;
           }else{
               System.out.println("Car already started...");
           }
       }
   
       void drive(){
           if(started)
               System.out.println("Driving now");
           else
               System.out.println("Start the Car first.");
       }
   
       void display(){
           System.out.println(String.format("Brand: %s | Model: %s | Price: %d | FuelType: %s", this.brand, this.model, this.price, this.fuelType));
       }
   }
   ```
   
   output:
   
   ```bash
   Brand: Maruti Suzuki | Model: Swift | Price: 700000 | FuelType: Petrol
   Start the Car first.
   Starting Car now...
   Driving now
   Car already started...
   Brand: Tata | Model: Nexon | Price: 1000000 | FuelType: Diesel
   Start the Car first.
   Starting Car now...
   Driving now
   Car already started...
   Brand: Mahindra | Model: Thar | Price: 1500000 | FuelType: Diesel
   Start the Car first.
   Starting Car now...
   Driving now
   Car already started...
   ```

3. Make a Book class with title, author, price, pages as attributes, display book details, reading, writing methods.
   
   ```java
   public class BookAssignment {
       public static void main(String[] args){
           Book[] books = {
               new Book("Wings of Fire", "A.P.J. Abdul Kalam", 180, 300),
               new Book("The Guide", "R.K. Narayan", 250, 350),
               new Book("Ignited Minds", "A.P.J. Abdul Kalam", 150, 250)
           };
   
           for(Book x: books){
               x.displayBookDetails();
               x.writing();
               x.reading();
           }
       }    
   }
   
   
   class Book{
       String title, author;
       int pages, price;
   
       Book(
           String title,
           String author,
           int pages,
           int price
       ){
           this.price = price;
           this.title = title;
           this.author = author;
           this.pages = pages;
       }
   
       void displayBookDetails(){
           System.out.println(String.format("Book title: %s | Author: %s | Number of pages: %d | Price: %s Rupees", this.title, this.author, this.pages, this.price));
       }
   
       void reading(){
           System.out.println("Reading the book...");
       }
   
       void writing(){
           System.out.println("Writing the book...");
       }
   }
   ```
   
   output:
   
   ```bash
   Book title: Wings of Fire | Author: A.P.J. Abdul Kalam | Number of pages: 180 | Price: 300 Rupees
   Writing the book...
   Reading the book...
   Book title: The Guide | Author: R.K. Narayan | Number of pages: 250 | Price: 350 Rupees
   Writing the book...
   Reading the book...
   Book title: Ignited Minds | Author: A.P.J. Abdul Kalam | Number of pages: 150 | Price: 250 Rupees
   Writing the book...
   Reading the book...
   ```

4. Perform addition of two user given inputs through the Scanner class
   
   ```java
   import java.util.Scanner;
   
   public class AddUsingScanner {
       public static void add(int a, int b){
           System.out.println("The sum is "+(a+b));
       }
   
       public static void main(String[] args){
           Scanner s = new Scanner(System.in);
           System.out.println("Enter the first number: ");
           int a = s.nextInt();
           System.out.println("Enter the second number: ");
           int b = s.nextInt();
           add(a, b);
       }
   }
   ```
   
   output: 
   
   ```bash
   Enter the first number: 
   3 5 
   Enter the second number: 
   The sum is 8
   Enter a boolean: 
   true
   Enter a double precision type number: 
   2.71
   Enter a string: 
   hello there
   The boolean: true | The double: 2.71 | The string: hello
   ```

Trainer: Pavan Kumar | Java [AN: 1315 - 1600]

---

### Inbuilt Classes in Java

These inbuilt classes consist of multiple methods which can be used rather than creating custom implementation again and again.

Following is a custom implementation of min/max functions

```java
class MinMax{
    public static int minReturn(int a, int b){
        return a<b ? a : b;
    }

    public static int maxReturn(int a, int b){
        return a>b ? a : b;
    }

    public static void main(String[] args){
        int x = 10; 
        int y = 20;

        System.out.println(String.format("Max of (%d, %d): %d", x, y, maxReturn(x, y)));
        System.out.println(String.format("Min of (%d, %d): %d", x, y, minReturn(x, y)));
    }
}
```

The same operation can be done using inbuilt classes, in this case, `Math`. It is within the `java.lang` package.

Using the inbuilt method, we make use of `Math.min(a,b)` and `Math.max(a,b)` as follows: 

```java
class InbuiltMinMax{
    public static void main(String[] args){
        int x = 10;
        int y = 20;

        System.out.println(String.format("Max of (%d, %d): %d", x, y, Math.max(x, y)));
        System.out.println(String.format("Min of (%d, %d): %d", x, y, Math.min(x, y)));

    }
}
```

---

### Method Overloading

Key questions that we must understand and answer by the end of this module:

1. What is Method Overloading?

2. Why do we need Method Overloading?

3. How to perform Method Overloading?

> Method Overloading is the process of writing/creating multiple methods with the same name but by differing in formal arguments in the Method Signature.

Note that each of those methods can have varying number of arguments and of different types as well.

*When a task has to be done in different ways, method overloading is done.*

Ex: If you want to **add** some numbers, you can create: 

```java
public static int add(int a, int b){}
public static int add(int a, int b, int c){}
public static float add(float a, float b, float c){}
// ...and so on as required
```

All the methods above will simply add the numbers, but the difference is in the number of args and types of args.

---

### Object Oriented Programming

*Real world* objects have **properties** and **behavior**.

- Consider a simple Smartphone:
  
  - It has various **properties** like Brand, Color, Storage, RAM
  
  - It has **functionalities/behaviours** like Chatting, Video Recording, Calling, Photography, Gaming.

In *Software world*, objects are simply a block of memory. 

- This block of memory stores all the relevant data - variables **and** methods.
  
  - These are different from variables(single block of memory), which stores single value and Arrays(multiple contiguous blocks of memory) which store the same type of data in continous blocks.

#### Object

> It is a block of memory which contains multiple methods and multiple variables, and this block of memory will be having some reference or address and is used to represent a real world entity.

#### The need for objects in programming

Representing a real world object in the form of program is known as *Object Oriented Programming*.

*Properties* of real world objects become *Variables*, while *Behaviors* become *Methods*.

```java
Properties mapped to Variables 
    brand of car -> String brand;
    color of car -> String color;
    number of wheels in car -> int wheels;


Behavior mapped to Methods
    accelerate -> public void accelerate(String input){};
    breaking -> public void decelerate(String input){};
    drifting -> public void performDrift(String input){};

//... and so on
```

Each object may have different number of properties and behaviours, so we need a blueprint for each different object.

This means that for a specific type of object we have a single blueprint that specifies the properties and methods within it for objects of each type.

This blueprint is created with the help of `Class`.

```java
class ClassName{
    // specify the real world properties in the form of variables
    // specify the real world behavior in the form of methods
}
```

- Remember that usually non-static methods are stored inside the classes.

To instantiate an object: 

```java
ClassName objectName = new ClassName();
```

Note that `ClassName()` is called the constructor.

The `new` keyword returns the address of the constructed block to the `objectName`. This is why the object name is called the `reference variable`.

```java
//Tell Rohit sir to start from "how to use objects"
```

---

#### Code exercise

1. Write a program to demonstrate method overlaoding for addition
   
   ```java
   class MethodOverloadingDemo{
       public static int add(int a, int b){
           return a+b;
       }
       public static float add(float a, float b){
           return a+b;
       }
       public static double add(double a, double b){
           return a+b;
       }
   
       public static int add(int a, int b, int c, int d){
           return a+b+c+d;
       }
       public static void main(String[] args){
           int x = 10;
           int y = 20;
           int w = 30;
           int z = 40;
           float k = 3.14f;
           float l = 2.71f;
           double h = 55555.778332;
           double u = 12345.247472;
   
           System.out.println(String.format("Adding: %d, %d: %d", x, y, add(x, y)));
           System.out.println(String.format("Adding: %d, %d, %d, %d: %d", x, y, w, z, add(x, y, w, z)));
           System.out.println(String.format("Adding: %.2f, %.2f: %.2f", k, l, add(k, l)));
           System.out.println(String.format("Adding: %.2f, %.2f: %.2f", h, u, add(h, u)));
       }
   }
   ```
   
   output: 
   
   ```bash
   Adding: 10, 20: 30
   Adding: 10, 20, 30, 40: 100
   Adding: 3.14, 2.71: 5.85
   Adding: 55555.78, 12345.25: 67901.03
   ```

2. Create a class for Car with its own properties and behavior.
   
   ```java
   class CarClass{
       public static void main(String[] args){
           Car car1 = new Car();
   
           System.out.println(car1.decelerate());
           System.out.println(car1.accelerate());
           System.out.println(car1.accelerate());
           System.out.println(car1.decelerate());
       }
   }
   
   class Car{
       
       String brand = "Mahindra";
       int windows = 4;
       int seats = 4;
       private boolean accelerating = false; 
   
       public String accelerate(){
           if (!accelerating){
               accelerating = true;
               return "Accelerating now...";
           }else{
               return "Already accelerating...";
           }
       }
   
       public String decelerate(){
           if (accelerating){
               accelerating = false;
               return "Decelerating now...";
           }else{
               return "Already decelerating...";
           }
       }
   
   }
   ```
   
   output: 
   
   ```bash
   
   ```

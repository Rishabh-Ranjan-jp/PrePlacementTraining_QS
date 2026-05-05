Trainer: Pavan Kumar | Java [AN: 1315 - 1600]

---

### Abstraction

> The process of hiding the internal implementation and only showing the external functionality to the user is known as abstraction.

Abstration is one of the key principles of Object Oriented Programming.

For instance, the internal implementation of the features/behaviour of an ATM is hidden from the user while letting the user perform the action.

It is all very similar when considering phone, car etc.

In java, with the help of abstract class and interface, we can achieve abstraction.

1. Abstract Method

2. Concrete Method

3. Abstract Class

4. Concrete Class

5. Interface

#### Abstract Method

>  The process of declaring a method using the `abstract` keyword in the method declaration and if the method is declared without method body/implementation.

```java
public abstract void mx();
```

#### Concrete Method

> The process of declaring a method without using the `abstract` keyword in the method declaration and providing method body/implementation is known as concrete method. It is a complete method.

```java
public static void my(){
    system.out.println("Hello");
}
```

#### Abstract Class

> Class that is declared using the abstract keyword and if a class contains atleast one abstract method, then the class should be defined using the `abstract` keyword.

If a class contains atleast one abstract method, then the class is called abstract class.

The abstract class contains both concrete methods and abstract methods, and it also contains constructors.

We **cannot** create an object of the abstract class.

| Abstract Class                                                                | Concrete Class                                          |
| ----------------------------------------------------------------------------- | ------------------------------------------------------- |
| contains constructors, abstract methods, abstract variables, concrete methods | contains constructors, methods, variables, initializers |

#### Concrete Class

If a class does not contain any abstract method and if the class is not declared using the abstract keyword, then the class is called concrete/complete class.

```java
class Classname{
    variables
    methods
    initializers
    constructors
}
```

To properly perform abstraction, we must first create abstract classes, provide their implementation in a subclass, and then use **Upcasting**.

---

#### Code exercise

1. Use method overriding the override the run method of superclass `Vehicle` in subclasses `Car` and `Bike`.
   
   - Code: 
     
     ```java
     public class VehicleOverride {
         public static void main(String[] args) {
             Vehicle[] list = {
                 new Vehicle(),
                 new Car(),
                 new Bike()
             };
     
             for (Vehicle v: list){
                 v.run();
             }
         }
     }
     
     class Vehicle{
         void run(){
             System.out.println("The vehicle is running.");
         }
     }
     
     class Car extends Vehicle{
         void run(){
             System.out.println("The car is running");
         }
     }
     
     class Bike extends Vehicle{
         void run(){
             System.out.println("The bike is running");
         }
     }
     ```
   
   - Output: 
   
   ```bash
   The vehicle is running.
   The car is running
   The bike is running
   ```

2. Perofrm and demonstrate abstraction on Vehicle, Car, Bike
   
   - Code
     
     ```java
     public class AbstractVehicles {
         public static void main(String[] args) {
             Vehicle[] list = {
                 new Car(),
                 new Bike()
             };
             for(Vehicle x: list){
                 x.fuelType();
                 x.run();
                 System.out.println();
             }
         }
     }
     
     abstract class Vehicle{
         abstract void run();
     
         void fuelType(){
             System.out.println("FuelType > : Petrol");
         }
     }
     
     class Car extends Vehicle{
         void run(){
             System.out.println("Driving car now.");
         }
     }
     
     class Bike extends Vehicle{
         void run(){
             System.out.println("Riding bike now.");
         }
     }
     ```
   
   . Output
     
     ```bash
     FuelType > : Petrol
     Driving car now.
     
     FuelType > : Petrol
     Riding bike now.
     ```

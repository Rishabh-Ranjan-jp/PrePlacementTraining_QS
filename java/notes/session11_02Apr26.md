Trainer: Pavan Kumar | Java [AN: 1315 - 1600]

---

### Combination of Static and Non-Static Members

> Remember that Constructors are not a thing that can be `static`. They are `non-static` members.

In a class where a combination of static and non static members exist, the execution happens as follows: 

```mermaid
flowchart LR
    sib[Static Initializer Block] --> sm[Static Methods]
    sm --> nsib[Non Static Initializer Block]
    nsib --> c[Constructor]
    c --> nsm[Non Static Methods]
```

The static methods and initlaizers run without a care if the actual class has been instantiated or not, while the non-static ones depend on an actual instance to exist. **Non staic members will not execute without an object**

### Object Oriented Programming

> It is a design principle which helps us to represent a real world entity in the form of software world entity.

OOP follows 4 main principles. The principles are: 

1. Encapsulation

2. Inheritance

3. Polymorphism

4. Abstraction

Real world entities have properties and behaviors, with the help of these we can represent the entity in the form of a program.

Representing a real world enntity in the form of a program is called as OOP.

#### Encapsulation

> The process of binding or wrapping the data members[Variables] and member functions[Methods] together as a single unit inside a class is called Encapsulation. 

The two main advantages of encapsulation are: 

1. Code reusability

2. Security[data hiding]

##### Code Reusability

For a single encapsulated class we can create multiple objects and we can use it *n* number of times.

##### Security [data hiding]

We can hide the data by making the data members[variables] as private and we can access the data members with the help of *getters* and *setters* methods.

In *getters* and *setters*, we will write some validation as well as some conditions to access the data members.

With the help of this we can prevent unauthorized access of data and we can provide controlled access for the data.

##### getter()

getter() methods are used to return a value and inside the method, we can perform some validation through conditions.

we can create the method with return type to return the value. 

Return is **Mandatory**.

```java
public returnType getterVarName(){
    // validation condition
    return variable
}
```

##### setter()

setter() method is used to initialize a property/variable. 

Through these methods we can initialize and re-initialize data of property/variable.

The setter methods are created with formal arguments.

```java
public void setterVarName(formalArgs){
    //initialization statements;
}
```

---

#### Code exercise

1. Create a class with non static methods, initalizers and static methods, initializers.
   
   ```java
   public class CominationOfStaticNonStatic {
       public static void main(String[] args) {
           CombinationClass.staticMethod();
           CombinationClass instance = new CombinationClass();
           instance.nonStaticMethod();
       }
   }
   
   class CombinationClass{
       {
           System.out.println("Non-static initializer block");
       }
       static{
           System.out.println("Static initializer block");
       }
       CombinationClass(){
           System.out.println("This is the constructor");
       }
       static void staticMethod(){
           System.out.println("Static method");
       }
       void nonStaticMethod(){
           System.out.println("Non-static method");
       }
   }
   ```
   
   output: 
   
   ```bash
   Static initializer block
   Static method
   Non-static initializer block
   This is the constructor
   Non-static method
   ```

2. Write a program to demonstrate encapsulation and getters and setters within it
   
   ```java
   public class EncapsulationAndGettersAndSetters {
       public static void main(String[] args) {
           Student student1 = new Student();
           student1.setAge(20);
           student1.setName("Steven");
           student1.setCourse("AIML");
           student1.setSid(1);
           System.out.println(String.format("ID: %d | Name: %s | Course: %s | Age: %d |", student1.getSid(), student1.getName(), student1.getCourse(), student1.getAge()));
       }
   }
   
   class Student{
       private int sid;
       private int age;
       private String name;
       private String course;
   
       public void setSid(int sid){
           this.sid = sid;
       }
   
       public void setName(String name){
           this.name = name;
       }
   
       public void setCourse(String course){
           this.course = course;
       }
   
       public void setAge(int age){
           this.age = age;
       }
   
       public int getSid(){
           return sid;
       }
   
       public int getAge(){
           return age;
       }
   
       public String getName(){
           return name;
       }
   
       public String getCourse(){
           return course;
       }
   
   }
   ```
   
   output: 
   
   ```bash
   
   ```

Trainer: Rohit Kumar | Java [FN: 0930 - 1230]

---

### Constructor Chaining

> The process of calling one constructor after another is called Constructor chaining

Consider:

```java
class Demo{
    Demo(){
        System.out.println("Hi");
    }
    Demo(int i){
        System.out.println("Hello");
    }
}
```

#### `this()`

>  This is used to achieve constructor chaining in the *same class*

##### Characteristics of `this()`

1. We can make use of n-1 `this()` statements.

2. The `this()` call statement must be inside the constructor only.

3. The first statement inside the constructor has to be the `this()` call statement.

### Non-static methods

> Methods that are not defined with the `static` keyword are called non-static methods.

The object stores both methods and variables as already mentioned, and the methods to be specific are non static.

These non staic methods are used so that data within the objects can be easily manipulated.

Static methods are never present inside the class, and are generally not used for object related operations

Non-static methods can be defined as follows

```java
<access modifier> methodName(formalArgs){
    //method 
}
```

#### Characteristics of Non-static methods

1. Non-static methods get their memory allocated inside the object.

2. Non-static methods can be invoked through the object reference.

3. Non-static methdos are allocated memory in each object that is created.

4. The block of non-static method is considered as **non-static context**.

5. All the non-static and static members can be used inside the non-static context without the reference of the object.

#### Non-static initializer

Single/Multiline instructions being executed during object creation process

```java
datatype identifier = value | expression;
```

These are executed before the main method for initialization. If there are multiple commands they can be put within the scope brackets `{//statements}`.

```java
public class InitializerBlock {

    public static void main(String[] args) {
        System.out.println("Starting main now");
        Initializer k = new Initializer();
        System.out.println("Ending main now");
    }
}

class Initializer{
    {
        int x = 10;
        int y = 20;
        System.out.println("Initialized "+x+" "+y);
        System.out.println("FinalValue: "+Math.random()*(x+y));
    }
    
    Initializer(){
        System.out.println("Just ran the constructor now.");
    }
}

```

output: 

```bash
Starting main now
Initialized 10 20
FinalValue: 10.53285053355731
Just ran the constructor now.
Ending main now
```

>  NOTE: x, y here are **NOT** object attributes. For that to be the case - x, y would have to be defined outside the initializer block, even if its values are set within braces.

##### Characteristics of Non-static initializer

1. They get executed during object creation.

2. They are only exectued ONCE per object that is created.

3. If there are multiple initializer blocks, they get executed top-down, before the constructor is called.

---

#### Code exercise

1. Write a program to show constructor chaining
   
   ```java
   public class DemoTrial {
       public static void main(String[] args) {
           Demo obj = new Demo();
           
       }
   }
   
   class Demo{
       Demo(){
           this(10); // used to call the parameterized constructor.
           System.out.println("From no args constructor");
       }
       Demo(int i){
           System.out.println("From paranmeterized constructor");
       }
   }
   ```
   
   output:
   
   ```bash
   From paranmeterized constructor
   From no args constructor
   ```

2. Perform constructor chaining on a simple stuent class with different constructors for name, age, id.
   
   ```java
   public class StudentDemoChained {
       public static void main(String[] args) {
           System.out.println();
           Student obj = new Student();
           System.out.println();
           Student obj1 = new Student("Adam");
           System.out.println();
           Student obj2 = new Student("Ellen", 23);
           System.out.println();
           Student obj3 = new Student("Stanley", 22, 111);
       }
   }
   
   class Student{
       
       String name;
       int age, id;
   
       Student(){
           System.out.println("No args constructor");
       }
   
       Student(String name){
           this.name = name;
           System.out.println("Name constructor");
       }
   
       Student(String name, int age){
           this(name);
           this.age = age;
           System.out.println("Name + Age constructor");
       }
   
       Student(String name, int age, int id){
           this(name, age);
           this.id = id;
           System.out.println("Name + Age + Id constructor");
       }
   } 
   // a non constructor chained method, the simpler more manual way is shown in StudentDemo.java
   ```
   
   output:
   
   ```bash
   No args constructor
   
   Name constructor
   
   Name constructor
   Name + Age constructor
   
   Name constructor
   Name + Age constructor
   Name + Age + Id constructor
   ```

3. Write a toy program to demonstrate accessing non static method in static context
   
   ```java
   public class StaticNonStaticDemo {
       
       int i = 1;
       static int j= 3;
       
       public static void main(String[] args) {
           StaticNonStaticDemo x = new StaticNonStaticDemo();
           x.demo();
       }    
   
       void demo(){
           System.out.println(i);
           System.out.println(j);
       }
   }
   
   ```
   
   ```bash
   1
   3
   ```

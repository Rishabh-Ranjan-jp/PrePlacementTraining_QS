Trainer: Pavan Kumar | Java [AN: 1315 - 1600]

---

A quick recap on the non-static methods: 

```java
<accessModifier> <returntype> methodName(formalArgs){
    //statements
}
```

```java
public void main(String[] args){
    //main method here.
}
```

Again, in an object, only **non-static methods and variables** will be stored.

Also, non-static methods are defined to access the non-static variables in general.

Initializer blocks use an anonymous block to initialize the non-static properties with some default values.

```java
{
    //non static initializer block
}
```

This is generally not used and is quite rare to spot in actual codebases.

In a program with non static initializer, constructor and non-static methods, the progression order of execution is: 

- Initializer -> Constructor -> Methods(if called).

Consider this(very cool)

```java
class Book{
    Book(){
        System.out.println("Default message");
    }
    {
        System.out.println("Initializer 1 Message");
    }
    {
        System.out.println("Initializer 2 Message");
    }
    {
        System.out.println("Initializer 3 Message");
    }
}
```

When the object is created and initialized with Book(), the initializers run first. This happens simply because the anonymous methods(initializers) are moved into the default (no args) constructor before its user specifed or actual contents! So it rearranges internally to look like this: 

```java
class Book{
    Book(){
        {
            System.out.println("Initializer 1 Message");
        }
        {
            System.out.println("Initializer 2 Message");
        }
        {
            System.out.println("Initializer 3 Message");
        }
         System.out.println("Default message"); // this was the actual constructor stuff.
    }
}
```

#### Static Variable

> A variable which is declared using a static keyword is known as static variable.

```java
static datatype varName = data;
//or 
static datatype varName;
```

Static Variable can be accessed through the classname(when accessing the var in another class) and with the variable name(if used within the same class).

If we have common properties for all the objects that is when static variables are used.

#### Static Method

> A method which is declared using static keyword in the method declaration is known as static method.

The best example: the main() method.

Static methods are used to access the static properties.

Static methods can be accessed through the class name(in different class) or with the method name(within the same class).

```java
<accessModifier> <returntype> methodName(formalArgs){
    //statements
}
```

note that accessModifier includes public, private, protected and static as well.

Note that if there is a local method with the same name as that of the static variable, when accessed directly by the varname, local variable value is returned, but if accessed by classname, then the static values are returned.

#### Static Initializer Block

> A block which is defined using a static keyword is called static initializer block.

```java
static {
    //initialization statements
}
```

Static initalizers are executed first in the class.

This initializer block executes **before** the non static initializer blocks.

The execution order for static members is - Static initializers => Static methods(if called).

---

#### Code exercise

1. Create static variable and access it using both classname and varname approach
   
   ```java
   public class UsingStatic {
       
       static int a = 10;
       static int b = 20;
       static int c = 30;
   
       public static void main(String[] args){
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
           System.out.println(UsingStatic.a);
           System.out.println(UsingStatic.b);
           System.out.println(UsingStatic.c);
       }
   }
   
   
   ```
   
   output: 
   
   ```bash
   10
   20
   30
   10
   20
   30
   ```

2. Access static variables declared in another class
   
   ```java
   public class AccessingStaticVarsOfDifferentClass {
       public static void main(String[] args) {
           System.out.println(DifferentClass.a);
           System.out.println(DifferentClass.b);
           System.out.println(DifferentClass.c);
       }
   }
   
   
   class DifferentClass{
       static int a = 111;
       static int b = 222;
       static int c = 333;
   }
   ```
   
   output:
   
   ```bash
   111
   222
   333
   ```

3. Create a static method and then access it.
   
   ```java
   public class CallingStaticMethods {
       
       public static void sub(){
           System.out.println("10 - 10 = "+(10-10));
       }
       
       public static void main(String[] args) {
           // calling static method of another class `StaticMethod`
           StaticMethods.add();
           // calling static method of this class
           sub(); 
       }
   }
   
   
   class StaticMethods{
       public static void add(){
           System.out.println("10 + 10 = "+(10+10));
       }
   }
   ```
   
   output:
   
   ```bash
   10 + 10 = 20
   10 - 10 = 0
   ```

4. Use Static and Non-static initializer blocks
   
   ```java
   public class StaticInitializerBlock {
       public static void main(String[] args) {
           StaticInitializerDemo k = new StaticInitializerDemo();    
       }
   }
   
   class StaticInitializerDemo{
       
       {
           System.out.println("This is the non static initializer");
       }
       static{
           System.out.println("This is the static initializer");
       }
   
   }
   ```
   
   output:
   
   ```bash
   This is the static initializer
   This is the non static initializer
   ```

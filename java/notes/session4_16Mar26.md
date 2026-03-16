Trainer: Rohit Kumar | Java [FN: 0930 - 1230]

---

### Methods

> A block/set of instructions that executes a certain task.

```java
<access modifier> <static> <return type> methodName(type formal_args){
    set of instructions
    return statement
} 
```

Some rules when it comes to defining methods: 

1. Methods are defined inside the class body.

2. Method nesting is illegal. That is, a method cannot be defined inside another method.

3. There can be n number of methods defined in a class - there are no restrictions.

Name of the method along with the formal args is called the *method signature*.

Modifier and return type along with method signature is called the *method declaration*.

*Method definition* is the the method declaration along with the the instructions and return type.

*Return type* specifies what type of data is returned back to the caller by the callee.

The classic main method:

```java
public static void main(String[] args){
    //set of instructions
}
```

#### Modifiers

Modifiers are of two types, and change the behavior of methods(and even classes):

1. Access Modifier
   
   1. Public 
   
   2. Private
   
   3. Protected

2. Non-Access Modifier
   
   1. Static
   
   2. Non-Static 
   
   3. abstract
   
   4. final

#### Characteristics of Methods

1. A method executes when it is called.

2. A method may be run *n* number of times.

#### Types of Methods

1. Based on arguments: 
   
   1. No argument methods
   
   2. Argument methods 

2. Based on scope:
   
   1. Static methods
   
   2. Non-static methods
   
   3. Abstract methods
   
   4. Final methods

##### No argument method

> Any method which is defined without any parameters.

```java
<modifiers> <return type> methodName(){
    // statements    
    return statement //unless void
} 
```

Advantage: No-argument methods can be called directly without passing any data

Disadvantage: data cannot be passed into No-argument methods

##### Argument method

> A method containing formal arguments is an argument method.

```java
<modifiers> <return type> methodName(type arg1, type arg2, ...){
    //statements
    return statement //unless void
}
```

Formal arguments are simply variables that are declared during method declaration. These variables are local to the method body.

*Actual arguments* are the actual variables that are passed to the method when they are called.



Advantage: Data can be passed into the method.

Disadvantage: The method cannot be called safely unless the method signature and type are known.



The JRE starts the execution of the main method and then methods can be called within the main method for execution.



#### Return statement

> `return` is a keyword in java for control transfer, that returns a value and also transfers the control from the calle to the caller.

1. return statement is **mandatory** for methods that have any return type other than `void`.

2. return statement is generally written at the end of the method.

3. return statement can only return a single data value.

4. return is optional with void type methods.



Valid ways to return for various types: 

```java
public void demo(){
    return;
}
```

```java
public void demo(){
    
}
```

```java
public double demo(){
    return 10.000;
}
```

```java
public int demo(){
    return 0;
}
```

Invalid way to return for various types:

```java
public void demo(){
    return 100;
}
```

```java
public double demo(){
    return;
}
```

```java
public double demo(){
   
}
```

```java
public int demo(){
    return 1,2;
}
```

```java
public int demo(){
    return 1;
    return 2;
}
```

#### Members of Class

Members are composed of

1. variables

2. methods

##### Static method

> A method declared with `static` keyword.

```java
<access modifier> static return-type methodName(args){
    //statements
}
```







---

### Code exercises

1. Make a no-argument method
   
   ```java
   class NoArgumentsMethod{
       public void demo(){
           System.out.println("Hi");
       }
   }
   ```
   
   output: 
   
   ```bash
   Hi
   ```

2. Make a no-argument summation method
   
   ```java
   class Summer{
   
       public static void summation(){
           System.out.println(1+1);
       }
   
       public static void main(String[] args){
           System.out.print("1 + 1 is ");
           summation();
       }
   }
   ```
   
   output: 
   
   ```bash
   1 + 1 is 2
   ```

3. Make a summation function that takes arguments
   
   ```java
   class ArgSummer{
      public static void main(String[] args){
          System.out.println(String.format("10 + 20 = %d",summer(10, 20)));
      }
   
      static int summer(int a, int b){
          return a+b;
      }
   }
   ```
   
   output: 
   
   ```bash
   10 + 20 = 30
   ```

4. Observe the flow control when methods are called
   
   ```java
   class MethodFLow{
       public static void main(String[] args){
           System.out.println("Main starts here: ");
           System.out.println("Calling demo method now: ");
           demo();
           System.out.println("Main ends here");
       }
       static void demo(){
           System.out.println("Control is now in the demo method");
           System.out.println("Exiting from demo now.");
       }
   }
   ```
   
   output: 
   
   ```bash
   Main starts here: 
   Calling demo method now: 
   Control is now in the demo method
   Exiting from demo now.
   Main ends here
   ```

5. Write a program to calculate the factorial of a number
   
   ```java
   import java.util.Scanner;
   
   class FactorialCalc{
       public static int factorial(int n){
           int fact = 1;
           for(int i = 2; i<=n; i++){
               fact *= i;
           }
           return fact;
       }
   
       public static void main(String[] args){
           System.out.println(String.format("5! = %d",factorial(5)));        
       }
   }
   ```
   
   output: 
   
   ```bash
   5! = 120
   ```

6. Use static keyword to access a method inside another class
   
   ```java
   import java.util.Scanner;
   
   class FactorialCalc{
       public static int factorial(int n){
           int fact = 1;
           for(int i = 2; i<=n; i++){
               fact *= i;
           }
           return fact;
       }   
   }
   
   class StaticFactorialDemo{
       public static void main(String[] args){
           System.out.println(String.format("5! = %d",FactorialCalc.factorial(5)));        
       }
   }
   ```
   
   output: 
   
   ```bash
   5! = 120
   ```

7. Write a program to use a method from another class to check if a number is prime
   
   ```java
   class PrimeCheck{
       public static void main(String[] args){
           System.out.println("1 is Prime: "+PrimeUtility.isPrime(1));
           System.out.println("2 is Prime: "+PrimeUtility.isPrime(2));
           System.out.println("3 is Prime: "+PrimeUtility.isPrime(3));
           System.out.println("4 is Prime: "+PrimeUtility.isPrime(4));
           System.out.println("278347 is Prime: "+PrimeUtility.isPrime(278347));
       }
   }
   
   class PrimeUtility{
       public static boolean isPrime(int num){
           if (num == 1)
               return false;
           else if (num == 2)
               return true;
           else if (num%2 == 0)
               return false;
           for(int i = 3; i<num/2; i++){
               if(num%i == 0)
                   return false;
           }
           return true;
       }
   }
   ```
   
   output:
   
   ```bash
   1 is Prime: false
   2 is Prime: true
   3 is Prime: true
   4 is Prime: false
   278347 is Prime: true
   ```



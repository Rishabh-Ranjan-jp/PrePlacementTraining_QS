Trainer: Pavan Kumar | Java [AN: 1315 - 1600]

---

### Looping Statements

> Looping statement helps the programmer to execute an instruction repetitively or mulitple times.

Types of looping statements in java: 

1. while-loop

2. do-while loop

3. for loop

4. nested loop

#### While-loop

```java
initialization
while(condition){
    instructions
    update statement
}
```

Essentially:

- A variable is declared and initialized

- The condition is evaluated, and `true` or `false` is returned. The while block only runs if the condition turns out to be `true`

- The instruction is then executed, and then the condition is evaluated again. If it evaluates to `true`, the instruction runs again, and this whole process is called **Iteration**, otherwise the loop terminates.

- The update statement updates the value of a variable used in the condition, and eventually lets the condition evaluate to `false` and terminate the loop

When we don't know the number of iterations to perform then we make use of the while loop statements.

#### do-while loop

```java
initialization
do{
    instructions
    update statement
}while(condition);
```

1. Once again the variables are initialized

2. The contol immediately steps in to the `do` block without checking the condition for the first time.

3. The instructions are executed and then finally the condition is checked. If the condition evaluates to `true`, the control goes back to the `do` block, otherwise, the control exits the do-while block.

do-while is preferred when you need to execture the instructions within the block atleast once without evaluating the condition.

#### for-loop

```java
for(initialization; condition; update){
    instructions    
}
```

1. Initialization statement initializes the initial state of the iteration var.

2. The condition is evaluated, and if `true`, the control starts to execute the statements

3. Then it updates the state of the interation variable, and then evaluates the condition again. If `true`, the instructions are executed again, otherwise the control exits.

for loops are preferred when we know the number of iterations that have to be performed

#### Nested loops

> Writing a loop inside a loop is considered as nested loop

```java
for(initialization; condition; update){
    for(initilizationl; condition; update){
        instructions
    }
}
```

Works exaclty like a for loop, but one inside the other.

Note: 

- `System.out.println()` prints the data and then moves the cursor to the next line

- `System.out.print()` prints the data and then keeps the cursor on the same line

---

### Code exercises

1. While loop to print 5 asterisks in new lines

```java
class whileLoop{
    public static void main(String[] args){
        int n = 5;
        int i = 0;
        while(i<5){
            System.out.println("*");
            i++;
        }
    }
}
```

output: 

```bash
*
*
*
*
*
```

2. While loop to print numbers from 1 to 5

```java
class whileLoop2{
    public static void main(String[] args){
        int i = 1;
        while(i < 6){
            System.out.println(i);
            i++;
        }
    }
}
```

output: 

```bash
1
2
3
4
5
```

3. Do while to print 5 stars and numbers from 1 through 5

```java
class dowhile1{
    public static void main(String[] args){
        int i = 0;
        System.out.println("Printing 5 starts: ");
        do{
            System.out.println("*");
            i++;
        }while(i<5);
        System.out.println("Printing number 1 through 5: ");
        i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<6);
    }
}
```

output: 

```bash
Printing 5 starts: 
*
*
*
*
*
Printing number 1 through 5: 
1
2
3
4
5
```

4. For loop to print 5 stars and numbers from 1 through 5

```java
class forloop1{
    public static void main(String[] args){
        System.out.println("Printing 5 stars: ");
        for(int i = 0; i<5; i++){
            System.out.println("*");
        }
        System.out.println("Numbers from 1 through 5: ");
        for(int i = 1; i<6; i++){
            System.out.println(i);
        }
    }
}
```

output: 

```bash
Printing 5 stars: 
*
*
*
*
*
Numbers from 1 through 5: 
1
2
3
4
5
```

5. Print the following pattern:
   
   ```bash
   * * *
   * * * 
   * * *
   ```

```java
class nestedLoop{
    public static void main(String[] args){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```



Trainer: Pawan Kumar | Java [AN: 13:15 - 16:00]

---

## Decision statements

> It helps a programmer to execute an instruction or to skip an instruction.

The various types are:  

1. If

2. if else

3. else if ladder

4. switch

### if statement

```java
if (condition){
    multiple statements
}
```

alternate syntax (single statement case): 

```java
if(condition)
    single statement
```

#### Condition

> It is an expresion which gives a boolean result - either true or false

### if-else statement

```java
if(condition){
    multiple statements
}else{
    multiple statements
}
```

alternate syntax (single statement case)

```java
if(condition)
    single statement
else
    single statement
```

### else-if ladder

```java
if(condition 1){
    multiple statements
}else if(condition 2){
    multiple statements
}else if(condition 3){
.
.
.
}else{
    multiple statements
}
```

alternate versoin: single statement varient

```java
if(condition 1)
    single statement
else if(condition 2)
    single statement
.
.
.
else
    single statement
```

### Switch statement

1. Switch without `break`

```java
switch(value){
    case x1: 
        {statements} 
    case x2: 
        {statements}
    case x3: 
    .
    .
    .
    default
        {statements}
}
```

2. Switch with `break`
   
   - `break` is a keyword
   
   - `break` is a control transfer statement
   
   - `break` is used in looping statements and switch

```java
switch(value){
    case x1: 
        {statements
        break;
    } 
    case x2: 
        {statements
        break;
    }
    case x3: 
    .
    .
    .
    default
        {statements}
}
```

---

## Code exercises

### Executing a simple if statement:

```java
class ifStatement{
    public static void main(String[] args){
        if(true){
            System.out.println("hello");
            System.out.println("good day");
        }
        System.out.println("bye");
    }
}       
```

output: 

```bash
hello
good day
bye
```

### Execute a simple single statement if statement

```java
class ifStatementSingle{
    public static void main(String[] args){
        if(true)
            System.out.println("sup");
            System.out.println("hello");
        System.out.println("Good day");
    }
}
```

output:

```bash
sup
hello
Good day
```

### Execute if-else statement

```java
class ifElseStatement{
    public static void main(String[] args){
        if(true){
            System.out.println("hello");
            System.out.println("good day");
        }else{
            System.out.println("STATEMENT 1");
            System.out.println("Stattement 2");
        }
        System.out.println("bye");
    }
}
```

```bash
hello
good day
bye
```

### Using else-if ladder

```java
class elseIfStatement{
	public static void main(String[] args){
		System.out.println("Statement0");
		if(true)
			System.out.println("statement1");
		else if(false)
			System.out.println("Statement2");
		else if(false)
			System.out.println("Statement3");
		else if(true)
			System.out.println("Statement4");
		else
			System.out.println("Statement5");
		System.out.println("Statement6");
	}
}
```

output:

```bash
Statement0
statement1
Statement6
```

### Switch case (without `break;`)

```java
class switchStatement{
	public static void main(String[] args){
		int x = 10;
		switch(x){
			case 0:
				System.out.println("0");
			case 10:
				System.out.println("1");
			case 20:
				System.out.println("2");
			default:
				System.out.println("fin");
		}
	}
}
```

output: 

```bash
1
2
fin
```

### Switch case (with `break;`)

```java
class switchBreaksStatement{
	public static void main(String[] args){
		int x = 10;
		switch(x){
			case 0:
				System.out.println("0");
				break;
			case 10:
				System.out.println("1");
				break;
			case 20:
				System.out.println("2");
				break;
			default:
				System.out.println("fin");
		}
	}
}
```

output:

```bash
1
```

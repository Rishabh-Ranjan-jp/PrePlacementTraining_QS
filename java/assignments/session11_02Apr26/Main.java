import solutions.*;

public class Main{
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Q1: Create a class Student with private fields name and age, and provide getter and setter methods:");
        Student student1 = new Student();
        student1.setAge(20);
        student1.setName("Adrian");

        System.out.println();
        System.out.println("Q2: Write a class car to follow proper encapsulation");
        Car car1 = new Car();
        car1.setBrand("Tata");
        car1.setColor("Black");
        car1.setDate("11-03-2025");
        car1.setModel("X");

        System.out.println();
        System.out.println("Q3: Create a class employee where the salary cannot be negative via validation in the setter method.");
        Employee employee1 = new Employee();
        employee1.setName("Adrian");
        employee1.setSalary(-1000);
        employee1.setSalary(1000);

        System.out.println();
        System.out.println("Q4: Create a class BankAccount with a private balance variable, and method to deposit and withdraw with validation.");
        BankAccount account1 = new BankAccount();
        account1.deposit(-100);
        account1.deposit(100);
        account1.withdraw(1000);
        account1.withdraw(100);

        System.out.println();
        System.out.println("Q5: Create a Book class where the price is read only and has no setter.");
        Book book1 = new Book("Why do humans exist?", 100);
        System.out.println("Name of the book is: "+book1.getName()+" and it is priced at "+book1.getPrice());

        System.out.println();
        System.out.println("Q6: Create a class person where the age is between 0 and 120, and reject invalid inputs.");
        Person person1 = new Person();
        person1.setAge(-100);
        person1.setAge(100);

        System.out.println();
        System.out.println("Q7: Create a PasswordManager class which enforces the legnth > 7 rule in the setter.");
        PasswordManager password1 = new PasswordManager();
        password1.setPassword("abdd");
        password1.setPassword("helloworld");

        System.out.println();
        System.out.println("Q8: Create a product class which enforces conditions that there must be atleast 1 unit in stock, and price should be non zero positive.");
        Product product1 = new Product();
        product1.setPrice(-100);
        product1.setPrice(100);
        product1.setQuantity(-1);
        product1.setPrice(100);
        
        System.out.println();
        Mobile mobile1 = new Mobile();
        mobile1.setPercentage(-111);
        mobile1.setPercentage(-1);
        mobile1.setPercentage(77);

        System.out.println();
    }
}
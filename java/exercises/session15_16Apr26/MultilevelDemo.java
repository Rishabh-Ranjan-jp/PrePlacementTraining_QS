public class MultilevelDemo {
    public static void main(String[] args) {
        Developer dev = new Developer("Adam", 23, 123456.7890, "Python");
        dev.DisplayDeveloper();
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Employee extends Person{
    double salary;

    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    void displayEmployee(){
        displayPerson();
        System.out.println("Salary: "+salary);
    }
}

class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, int age, double salary, String programmingLanguage){
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void DisplayDeveloper(){
        displayEmployee();
        System.out.println("Preferred Programming Language: "+programmingLanguage);
    }
}

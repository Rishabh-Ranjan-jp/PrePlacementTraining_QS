public class BasicEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Jason", 1000, 100);
        manager.displayDetails();
        manager.totalSalary();
    }
}

class Employee{
    String name;
    int salary;

    void displayDetails(){
        System.out.println("Employee: "+name+", Salary: "+salary);
    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee{
    int bonus;

    void totalSalary(){
        System.out.println("Total Salary(including bonus): "+(bonus+salary));
    }

    Manager(String name, int salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
}
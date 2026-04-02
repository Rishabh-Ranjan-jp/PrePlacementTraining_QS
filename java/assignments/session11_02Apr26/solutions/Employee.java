package solutions;

public class Employee {
    private String name;
    private double salary;

    public void setName(String name){
        this.name = name;
        System.out.println("Employee name set to: "+getName());
    }

    public void setSalary(double salary){
        if(salary<0){
            System.out.println("Salary cannot be a negative value("+salary+"). Please enter a valid positive non-zero value.");
            return;
        }
        this.salary = salary;
        System.out.println("Salary of the employee has been set to: "+getSalary());
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

}

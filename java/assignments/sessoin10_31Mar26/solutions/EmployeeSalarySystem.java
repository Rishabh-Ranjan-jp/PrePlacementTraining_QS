package solutions;

public class EmployeeSalarySystem {
    
    long id;
    double salary;

    private long idCounter = Math.round(Math.random()*23);
    static double companyBonus = 1000;

    public EmployeeSalarySystem(double salary){
        id += idCounter;
        this.salary = salary;
    }

    public void displayMaxBonusSalary(){
        System.out.println(String.format("EXCEPTOINAL BONUS:: ID: %d | Salary: %.2f | Bonus: %.2f | Total Salary: %.2f", this.id, this.salary, companyBonus, (this.salary+companyBonus)));
    }
        public void displayDefaultBonusSalary(){
        double companyBonus = 100;
        System.out.println(String.format("STANDARD BONUS:: ID: %d | Salary: %.2f | Bonus: %.2f | Total Salary: %.2f", this.id, this.salary, companyBonus, (this.salary+companyBonus)));
    }
}

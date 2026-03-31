import solutions.*;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Question 1: Design a student class, print total students created");

        StudentCounterSystem[] students = {
        new StudentCounterSystem("Adam", 21),
        new StudentCounterSystem("James", 20)
        };
        StudentCounterSystem.showStudentCount();

        System.out.println();
        System.out.println("Question 2: Design BankAccount and show how all accounts reflect change in bank name");

        BankAccountSystem account1 = new BankAccountSystem(1000);
        account1.DisplayAccountIds();
        BankAccountSystem.ChangeBankName("Ultimate black money bank");
        account1.DisplayAccountIds();

        System.out.println();
        System.out.println("Question 3: Design Employee class and compare static vs instance variable usage");

        EmployeeSalarySystem badEmployee = new EmployeeSalarySystem(12300);
        EmployeeSalarySystem goodEmployee = new EmployeeSalarySystem(12300);
        goodEmployee.displayMaxBonusSalary();
        badEmployee.displayDefaultBonusSalary();

    }
}

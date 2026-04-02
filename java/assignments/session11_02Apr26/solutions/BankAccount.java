package solutions;

public class BankAccount {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount<1){
            System.out.println("Cannot depoit zero or negative value into account. Try again with a valid deposit amount");
            return ;
        }
        balance += amount;
        System.out.println("You deposited "+amount+". Your current balance: "+getBalance());
    }

    public void withdraw(double amount){
        if(getBalance() < amount){
            System.out.println("You do not have the enough money to perform this withdrawl. Insufficient balance.");
            return ;
        }
        balance -= amount;
        System.out.println("You withdrew "+amount+". Your current balance: "+getBalance());
    }
}

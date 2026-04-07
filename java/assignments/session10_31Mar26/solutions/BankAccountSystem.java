package solutions;

public class BankAccountSystem {
    private int accountNumber;
    private double balance;

    static String bankName = "Lakshmi Chit Fund Bank";
    private long accountNumberMod = Math.round(Math.random()*23);

    BankAccountSystem(){
        this.accountNumber += accountNumberMod;
    }

    public BankAccountSystem(int balance){
        this();
        this.balance = balance;
    }

    public static void ChangeBankName(String modifiedBankName){
        bankName = modifiedBankName;
    }

    public void DisplayAccountIds(){
        System.out.println("Accoutn in "+bankName+", Account number: "+this.accountNumber);
    }
}

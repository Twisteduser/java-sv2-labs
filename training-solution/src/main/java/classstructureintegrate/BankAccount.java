package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String owner, String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public String getInfo(){
        return(owner + " (" + accountNumber +") : "+ balance +" Ft");
    }
}

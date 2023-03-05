package LabManualInheritance;

public class Bank {
    public String name;
    private String id;
    private double balance;

    static {
        System.out.println("Welcome to Bangladesh Bank.");
    }
    public Bank(){
        System.out.println("You are now in the Bank");
    }
    public Bank(String name, String id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if (balance > amount){
            balance -= amount;
        }
    }

    void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
}

class savingsAccount extends Bank{

    private double interestRate;
    public int year;
    public savingsAccount(){
        System.out.println("Savings Account");
    }
    public savingsAccount(double interestRate, int year){
        super("Rahim", "123", 5000);
        this.interestRate = interestRate;
        this.year = year;
    }

}
class Main{
    public static void main(String[] args) {
        Bank A = new savingsAccount(1.2,2);
        A.deposit(2000);
        A.checkBalance();
        A.withdraw(1000);
        A.checkBalance();
    }
}

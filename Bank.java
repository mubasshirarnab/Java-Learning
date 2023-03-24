package AbstractClass;

/*     Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited
       in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
       each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.  */

public abstract class Bank {
    double balance;

    public Bank(double balance){
        this.balance = balance;
    }

    abstract void getBalance(double amount);
}

class BankA extends Bank{
    public BankA(double balance){
        super(balance);
    }

    @Override
    void getBalance(double amount) {
        balance+=amount;
        System.out.println("The Balance is: " + balance + "/-");
    }
}
class BankB extends Bank{
    public BankB(double balance){
        super(balance);
    }

    @Override
    void getBalance(double amount) {
        balance+=amount;
        System.out.println("The Balance is: " + balance + "/-");
    }
}
class BankC extends Bank{
    public BankC(double balance){
        super(balance);
    }

    @Override
    void getBalance(double amount) {
        balance+=amount;
        System.out.println("The Balance is: " + balance + "/-");
    }
}

class TestBalance{
    public static void main(String[] args) {
        Bank A = new BankA(5000);
        A.getBalance(2000);

        Bank B = new BankB(7000);
        B.getBalance(1500);

        Bank C = new BankC(10000);
        C.getBalance(5000);
    }
}

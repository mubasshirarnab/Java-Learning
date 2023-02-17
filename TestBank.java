package OfflineTest01;

//Complete the skeleton code
// Write all unfinished code and function
class BankAccount{
    double balance;
    int id;
    // Type of the account. Can be of two types: current or savings
    String accountType;

    // i. Write a Constructor
    public BankAccount(double balance, int id, String accountType){
        this.balance = balance;
        this.id = id;
        this.accountType = accountType;
    }

    // ii. This function increases the balance by amount
    public void deposit(double amount){
        balance+=amount;
        System.out.println("New Balance after Deposit: " + balance);
    }

    // iii. This function decreases the balance by amount
    public void withdraw(double amount){
        if (balance > amount){
            balance-=amount;
            System.out.println("New Balance after Withdraw: " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

class Bank{
    BankAccount[] records;
    double savingInterestRate = 3.5;
    double currentInterestRate = 0.4;

    // iv. Write a constructor
    public Bank(double savingInterestRate, double currentInterestRate){
        this.savingInterestRate = savingInterestRate;
        this.currentInterestRate = currentInterestRate;
        this.records = new BankAccount[0];
    }
    // v. Complete the function
    public void createBankAccount(double initialBalance, int accountId, String accountType){
        //Create an object of BankAccount class
        // Add the object to records array

        BankAccount newAccount = new BankAccount(initialBalance,accountId,accountType);
        BankAccount[] newBankRecords = new BankAccount[records.length+1];

        for (int i = 0; i < records.length; i++){
            records[i] = newBankRecords[i];
        }
        newBankRecords[records.length] = newAccount;
        records = newBankRecords;
    }

    // vi. deposit amount to the bank account having id == accountId
    public void addBalance(int accountId, double amount){
        for (BankAccount i: records){
            if (i.id == accountId){
                i.deposit(amount);
            }
        }

    }

    // vii. withdraw amount from the bank account having id == accountId
    public void withdrawBalance(int accountId, double amount){
        for (BankAccount i : records){
            i.withdraw(amount);
        }
    }

    // viii. Calculate interest for the account having id == accountId
    public double calculateInterest(int accountId, int year){
        //formula: balance*interestRate*year

        double interestRate = 0.0;
        for (BankAccount i : records){
            if(i.id == accountId){
                if (i.accountType.equals("savings")){
                    interestRate = i.balance * savingInterestRate * year;
                }
                else {
                    interestRate = i.balance * currentInterestRate * year;
                }
            }
        }
        return interestRate;
    }

    // ix. Calculate the total balance for the account having id == accountId
    public double calculateTotalBalance(int accountId, int year){
        for (BankAccount i : records){
            if(i.id == accountId){
                double interest = calculateInterest(accountId,year);
                return i.balance+=interest;
            }
        }
        return 0;
    }

    //Add amount take bonus to those accounts whose balance > 1000.
    public void addBonus(double amount){
        for (BankAccount i : records){
            if (i.balance>1000){
                i.balance+=amount;
                System.out.println("Balance after Bonus: " + i.balance);
            }
        }
    }

}

public class TestBank {
    public static void main(String[] args) {
        Bank A = new Bank(3.3,2.5);
        A.createBankAccount(20000,1,"savings");
        A.addBalance(1,2000);
        A.withdrawBalance(1, 1000);
        System.out.println(A.calculateInterest(1,1));
        System.out.println("Total Balance: " + A.calculateTotalBalance(1,1));
        A.addBonus(1000);
    }
}

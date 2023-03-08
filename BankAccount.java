package LabManual;

import java.util.Scanner;

public class BankAccount {
    public String name;
    public String accountID;
    public double balance;

    public void deposit(double a){
        balance = balance + a;
        System.out.println("Balance after Deposit: " + balance );
    }

    public void withdraw(double b){
        if(b<balance){
            balance-=b;
        }
        System.out.println("Balance after Withdraw: " + balance);
    }

    public void Balance(){
        System.out.println("Current Balance is: " + balance);
    }

   /* public void display(){
        deposit();
        withdraw();
        Balance();
    } */
}

class Person{
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();

        Scanner sc = new Scanner(System.in);

        a1.name = sc.nextLine();
        a1.accountID = sc.nextLine();
        a1.balance = sc.nextDouble();

        a2.name = sc.nextLine();
        a2.accountID = sc.nextLine();
        sc.nextLine();
        a2.balance = sc.nextDouble();

        System.out.println("First person's information: ");
        System.out.println(a1.name);
        System.out.println("Balance: " + a1.balance);
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.Balance();


        System.out.println("Second person's information: ");
        System.out.println(a2.name);
        System.out.println("Balance: " + a2.balance);
        a2.deposit(3000);
        a2.withdraw(1500);
        a2.Balance();
    }
}

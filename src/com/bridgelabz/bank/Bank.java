package com.bridgelabz.bank;

import java.util.ArrayList;
public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account obj){
        accounts.add(obj);
        System.out.println(accounts);
    }

    void removeAccount(Account obj){
        accounts.remove(obj);
        System.out.println("Account is removed: ");
        System.out.println("Remaining account is: " + accounts);
    }
    void depositMoney(double initialBalance, double balance){
        double depositBalance = initialBalance + balance;
        System.out.println("Initial balance is: " + initialBalance);
        System.out.println("Deposit amount is: " + balance);
        System.out.println("Total balance after deposit: " + depositBalance);

    }
    void withdrawMoney(double  initialBalance,double amount){
       if (initialBalance>=amount){
           double withdrawAmount = amount;
           System.out.println("Initial balance is: " + initialBalance);
           System.out.println("Withdraw amount is: " + withdrawAmount);
           double remainingAmount = initialBalance - amount;
           System.out.println("Remaining amount is: " + remainingAmount);
       }
    }
}

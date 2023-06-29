package com.bridgelabz.bank;
/* Write a Java program to create a class called "Bank" with a collection of accounts
 and methods to add and remove accounts, and to deposit and withdraw money.
  Also define a class called "Account" to maintain account details of a particular customer.*/

public class Account {
    private String name;
    private long accountNumber;
    private double balance;

    public Account(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

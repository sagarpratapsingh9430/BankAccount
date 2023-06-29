package com.bridgelabz.bank;

public class BankAccountMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Sagar",32435772,20000.0);
        Account account2 = new Account("Raj",547383427,25000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.removeAccount(account1);

        bank.depositMoney(2500,200);
        bank.withdrawMoney(5000,1300);


    }
}

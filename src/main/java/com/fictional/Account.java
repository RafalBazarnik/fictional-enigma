package com.fictional;

public class Account
{
    private double accountBalance;
    private String accountNumber;


    private Account() {
    }

    public Account(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public double checkBalance() {
        return accountBalance;
    }

    public void transfer(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            throw new IllegalArgumentException("Cannot transfer zero or less!");
        }
    }

    public boolean withdraw(double amount) {
        if (this.accountBalance < amount) {
            return false;
        } else {
            this.accountBalance -= amount;
            return true;
        }
    }
}

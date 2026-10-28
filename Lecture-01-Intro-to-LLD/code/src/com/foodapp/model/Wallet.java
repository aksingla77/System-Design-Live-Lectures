package com.foodapp.model;

public class Wallet {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    public void pay(double amount) {
        if (amount > balance) {
            throw new IllegalStateException("Not enough balance. Need Rs " + amount + ", have Rs " + balance);
        }
        balance -= amount;
    }
}

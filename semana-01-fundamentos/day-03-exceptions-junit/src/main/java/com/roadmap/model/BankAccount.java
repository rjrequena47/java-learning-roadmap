package com.roadmap.model;

public class BankAccount {
    private int id;
    private String owner;
    private double balance;

    public BankAccount(int id, String owner, double initialBalance) {
        this.id = id;
        this.owner = owner;
        this.balance = initialBalance;
    }

    public int getId() { return id; }
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}

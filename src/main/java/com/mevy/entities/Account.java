package com.mevy.entities;

import com.mevy.entities.interfaces.IAccount;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount{
    
    private static final int STANDARD_BRANCH = 1;
    private static int SEQUENCE = 1;

    protected int branch;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.branch = STANDARD_BRANCH;
        this.number = SEQUENCE++;
        this.client = client;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void transfer(double value, Account account) {
        this.withdraw(value);
        account.deposit(value);
    }

    protected void printInformations() {
        System.out.println(String.format("Client Name: %s ", this.client.getName()));
        System.out.println(String.format("Branch: %d ", this.branch));
        System.out.println(String.format("Number: %d ", this.number));
        System.out.println(String.format("Balance: %.2f ", this.balance));
    }

}

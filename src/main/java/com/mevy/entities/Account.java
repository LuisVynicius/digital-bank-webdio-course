package com.mevy.entities;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount{
    
    private static final int STANDARD_BRANCH = 1;
    private static int SEQUENCE = 1;

    protected int branch;
    protected int number;
    protected double balance;

    public Account() {
        this.branch = STANDARD_BRANCH;
        this.number = SEQUENCE++;
    }

    public void withdraw(double value) {
        
    }

    public void deposit(double value) {
        
    }

    public void transfer(double valor, Account account) {
        
    }

}

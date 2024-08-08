package com.mevy.entities;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount{
    
    private int branch;
    private int number;
    private double balance;

    public void withdraw(double value) {
        
    }

    public void deposit(double value) {
        
    }

    public void transfer(double valor, Account account) {
        
    }

}

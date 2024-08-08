package com.mevy.entities;

import lombok.Getter;

@Getter
public class CheckingAccount {
    
    private int branch;
    private int number;
    private double balance;

    public void withdraw() {}

    public void deposit() {}
    
    public void transfer() {}

}
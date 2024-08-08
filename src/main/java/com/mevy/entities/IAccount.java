package com.mevy.entities;

public interface IAccount {
    
    void withdraw(double value);

    void deposit(double value);

    void transfer(double valor, Account account);

}

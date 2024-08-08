package com.mevy.entities.interfaces;

import com.mevy.entities.Account;

public interface IAccount {
    
    void withdraw(double value);

    void deposit(double value);

    void transfer(double valor, Account account);

    void printStatement();
}

package com.mevy.entities;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }
    
    @Override
    public void printStatement() {
        System.out.println("SavingAccount");
        super.printInformations();
    }

}

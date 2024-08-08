package com.mevy.entities;

public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("CheckingAccount");
        super.printInformations();
    }

}
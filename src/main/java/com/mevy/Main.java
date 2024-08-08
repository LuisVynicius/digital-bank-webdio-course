package com.mevy;

import com.mevy.entities.Account;
import com.mevy.entities.CheckingAccount;
import com.mevy.entities.Client;
import com.mevy.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Client client01 = new Client("Client01");

        Account account01 = new CheckingAccount(client01);
        Account account02 = new SavingsAccount(client01);

        account01.deposit(100);
        account01.transfer(10, account02);

        account01.printStatement();
        account02.printStatement();
    }
}
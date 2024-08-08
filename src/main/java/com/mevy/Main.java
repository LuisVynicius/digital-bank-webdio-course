package com.mevy;

import com.mevy.entities.Account;
import com.mevy.entities.Bank;
import com.mevy.entities.CheckingAccount;
import com.mevy.entities.Client;
import com.mevy.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Client client01 = new Client("Client01");

        Bank bank01 = new Bank("Bank01");

        Account account01 = new CheckingAccount(client01);
        Account account02 = new SavingsAccount(client01);

        bank01.addClient(account01);
        bank01.addClient(account02);

        account01.deposit(100);
        account01.transfer(10, account02);

        account01.printStatement();
        account02.printStatement();

        System.out.println(client01);

        bank01.printAllClients();

    }
}
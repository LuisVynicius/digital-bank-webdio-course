package com.mevy.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;

public class Bank {

    @Getter
    private String name;
    private List<Account> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public void printAllClients() {
        Set<String> clientsSet = new HashSet<>();
        this.clients.forEach(x -> clientsSet.add(x.getClient().getName()));
        System.out.print("Clients: ");
        clientsSet.forEach(System.out::print);
        System.out.print('\n');
    }

    public void addClient(Account account) {
        this.clients.add(account);
    }

}

package com.mevy.entities;

import java.util.List;

import lombok.Getter;

@Getter
public class Bank {
    
    private String name;
    private List<Account> client;

}

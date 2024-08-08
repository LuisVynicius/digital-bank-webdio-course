package com.mevy.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Client {
    
    private String name;

    @Override
    public String toString() {
        return "Client: " + this.name;
    }

}

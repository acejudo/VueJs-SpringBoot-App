package com.acejudo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Greeting {

    @Value( "${greet}" )
    private String greet;
    
    @Value( "${environment}" )
    private String environment;

    public String sayHello(Long number, String name){
        return String.format("%s %s %s %s",number, greet, name, environment);
    }
}

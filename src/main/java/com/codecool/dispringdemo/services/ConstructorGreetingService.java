package com.codecool.dispringdemo.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello I was Injected by the constructor!!";
    }
}

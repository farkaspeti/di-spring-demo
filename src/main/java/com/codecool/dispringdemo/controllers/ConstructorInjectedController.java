package com.codecool.dispringdemo.controllers;

import com.codecool.dispringdemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    
    public GreetingService greetingService;
    
   
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

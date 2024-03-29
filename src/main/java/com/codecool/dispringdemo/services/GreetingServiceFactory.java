package com.codecool.dispringdemo.services;

public class GreetingServiceFactory {
    
    private GreetingRepository greetingRepository;
    
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    
    public GreetingService createGreetingService(String language) {
    
    
        switch (language) {
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}

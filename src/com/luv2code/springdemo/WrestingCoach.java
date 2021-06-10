package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

@Component
public class WrestingCoach implements Coach {

    private FortuneService fortuneService;

    public WrestingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Train hard my son!";
    }

    @Override
    public String getDailyFortune() throws FileNotFoundException {
        return fortuneService.getFortune();
    }
}

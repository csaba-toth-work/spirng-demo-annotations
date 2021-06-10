package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Hit hard the ball!";
    }

    @Override
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}

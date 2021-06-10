package com.luv2code.springdemo;

import java.io.FileNotFoundException;

public interface Coach {

    String getDailyWorkout();

    String getDailyFortune() throws FileNotFoundException;
}

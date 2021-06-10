package com.luv2code.springdemo;

import java.io.FileNotFoundException;

public class SadFortuneService implements FortuneService{

    @Override
    public String getFortune() throws FileNotFoundException {
        return "Today is sad day";
    }
}

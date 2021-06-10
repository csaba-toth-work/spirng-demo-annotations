package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;

public class PracticeJavaConfigDemoApp {

    public static void main(String[] args) throws FileNotFoundException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PracticeSportConfig.class);

        Coach theCoach = context.getBean("wrestlingCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }


}

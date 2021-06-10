package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;

public class JavaConfigDemoApp {

    public static void main(String[] args) throws FileNotFoundException {

        // read spring config java file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}

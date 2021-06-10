package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class ReaderFortuneService implements FortuneService {

    private String fileName = "/home/lenovo/IdeaProjects/spirng-demo-annotations/src/com/luv2code/springdemo/fortunes.txt";
    private Random random = new Random();
    private List<String> fortunes = new ArrayList<>();

    public ReaderFortuneService() {
        System.out.println(">> FileFortuneService: inside default constructor");
    }

    @PostConstruct
    private void loadTheFortunesFile() {
        System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");
        File theFile = new File(fileName);
        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());
        try {
            Scanner scanner = new Scanner(new File(fileName));
            scanner.useDelimiter(".");
            while (scanner.hasNextLine()) {
                fortunes.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Override
    public String getFortune() {
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}

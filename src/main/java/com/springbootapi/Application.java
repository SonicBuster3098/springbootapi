package com.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);

        DataManager dm = new DataManager();
        dm.runSQL("CREATE TABLE Messages(Messenger VARCHAR(255), Content VARCHAR(255), Reciever VARCHAR(255));");
        // System.out.println(dm.getTableLength(""));


    }
}
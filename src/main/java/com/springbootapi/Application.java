package com.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // DataManager dm = new DataManager();
        // dm.runSQL("CREATE TABLE Users(Username VARCHAR(50), Password VARCHAR(255));");
        // dm.runSQL("INSERT INTO Messages(Content) VALUES ('hi')");
        // dm.runSQL("DELETE FROM Messages WHERE Content='hi'");
        // System.out.println(dm.getTableLength(""));
        // dm.runSQL("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='BASE TABLE'");


    }
}
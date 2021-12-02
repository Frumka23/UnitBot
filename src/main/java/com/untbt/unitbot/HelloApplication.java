package com.untbt.unitbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@SpringBootApplication
@EnableConfigurationProperties
public class HelloApplication extends Application {

    public static void main(String[] args) {

        SpringApplication.run(HelloApplication.class, args);
    }
}
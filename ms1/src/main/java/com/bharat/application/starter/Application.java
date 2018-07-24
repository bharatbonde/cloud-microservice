package com.bharat.application.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO: Make swagger work
//@Import(SwaggerConfig.class)
@SpringBootApplication(scanBasePackages="com.bharat.rest.endpoints")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

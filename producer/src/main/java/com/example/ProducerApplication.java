package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ProducerConfiguration.class)
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ProducerApplication.class);
        // We don't need a web application for the demo right now
        application.setWebEnvironment(false);
        application.run(args);
    }
}
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by alex on 1/29/18.
 */

@SpringBootApplication
@EnableConfigServer
public class TradingConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradingConfigServerApplication.class, args);
    }
}
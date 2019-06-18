package com.configserver.configserver101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Configserver101Application {

    public static void main(String[] args) {
        SpringApplication.run(Configserver101Application.class, args);
    }

}

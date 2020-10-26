package com.microservices.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaServer
@CrossOrigin(origins = "http://localhost:8761")
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}

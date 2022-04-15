package com.example.kitchensink.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class KitchenSinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(KitchenSinkApplication.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("Executes after beans are instantiated");
    }

}



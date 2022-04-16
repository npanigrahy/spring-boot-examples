package com.example.kitchensink.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(1)
public class MyApplicationRunner1 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        log.info("Executed runner1");
    }
}



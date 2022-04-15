package com.example.kitchensink.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ApplicationStartEvent {

    @EventListener(ApplicationReadyEvent.class)
    public void onReadyEvent() {

        log.info("Executes when application is ready");
    }
}

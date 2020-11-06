package com.codemcd.springbootloggingsystem.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogbackService {

    public void showLogback() {
        log.error("SERVICE ERROR LEVEL LOG");
        log.warn("SERVICE WARN LEVEL LOG");
        log.info("SERVICE INFO LEVEL LOG");
        log.debug("SERVICE DEBUG LEVEL LOG");
        log.trace("SERVICE TRACE LEVEL LOG");
    }
}

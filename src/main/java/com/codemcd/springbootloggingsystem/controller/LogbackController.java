package com.codemcd.springbootloggingsystem.controller;

import com.codemcd.springbootloggingsystem.service.LogbackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogbackController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final LogbackService logbackService;

    public LogbackController(LogbackService logbackService) {
        this.logbackService = logbackService;
    }

    @GetMapping("/logback")
    public String showLog() {
        logger.error("CONTROLLER ERROR LEVEL LOG");
        logger.warn("CONTROLLER WARN LEVEL LOG");
        logger.info("CONTROLLER INFO LEVEL LOG");
        logger.debug("CONTROLLER DEBUG LEVEL LOG");
        logger.trace("CONTROLLER TRACE LEVEL LOG");

        logbackService.showLogback();

        return "Hello Logback";
    }
}

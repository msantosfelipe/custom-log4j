package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping("/")
    public String home() {
        SecureRandom random = new SecureRandom();
        MDC.put("randomId", String.valueOf(random.nextInt()));
        logger.info("Called Hello");
        return "Hello";
    }

}



package com.codemcd.springbootloggingsystem.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class LogbackControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void call_controller() {
        webTestClient.get().uri("/logback")
                .exchange()
                .expectStatus()
                .isOk()
                ;
    }
}

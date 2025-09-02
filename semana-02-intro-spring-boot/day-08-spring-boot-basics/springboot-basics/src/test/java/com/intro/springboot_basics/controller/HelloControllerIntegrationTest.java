package com.intro.springboot_basics.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturnHelloWorldWhenNoNameProvided() {
        String body = restTemplate.getForObject("/hello", String.class);
        assertThat(body).isEqualTo("Hello, World!");
    }

    @Test
    void shouldReturnHelloWithNameWhenProvided() {
        String body = restTemplate.getForObject("/hello?name=Ricardo", String.class);
        assertThat(body).isEqualTo("Hello, Ricardo!");
    }

}

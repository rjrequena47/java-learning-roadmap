package com.intro.springboot_basics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(
            @RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

}

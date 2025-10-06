package com.example.lms; // <-- MUST match your base package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // <-- MUST be present and correctly spelled
public class HelloWorldController {

    @GetMapping("/hello") // <-- MUST be present and correctly spelled
    public String sayHello() {
        return "Hello, World!";
    }
}
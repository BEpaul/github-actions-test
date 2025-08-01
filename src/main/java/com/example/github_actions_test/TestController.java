package com.example.github_actions_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Error");
    }
}

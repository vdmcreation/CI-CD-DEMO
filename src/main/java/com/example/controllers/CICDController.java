package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/ci-cd")
public class CICDController {
    @GetMapping("/message")
    public String getMessage() {
        System.out.println("hello");
        System.out.println("hello");
        return "Hello, ci-cd demo testing succeed";
    }
}

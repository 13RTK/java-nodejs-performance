package com.alex.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

// Default
//    @GetMapping("/")
//    String helloWorld() {
//        return "Hello World";
//    }

    // Webflux
    @GetMapping("/")
    public Mono<String> helloWorld() {
        return Mono.just("Hello World");
    }
}

package com.optionmetrics.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestControllerService {

    @GetMapping(name = "test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity helloWorld() {
        System.out.println("Hi");
        return ResponseEntity.ok().body("{\"hello\": \"world\"}");
    }

}

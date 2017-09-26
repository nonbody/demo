package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestX ZZZZZZZZZZZZZZZZZZZZ{
	
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "hello " + name;
    }	
X
}

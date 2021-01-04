package com.example.demo;

import com.example.demo.model.ExampleData;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/msg")
    public ExampleData msg() {
        ExampleData hello = ExampleData.builder().msg("hello").build();
        System.out.println(hello.getMsg());
        return hello;
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! V4";
    }
}
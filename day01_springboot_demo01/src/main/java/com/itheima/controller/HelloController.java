package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("this is a git update branches");
        return "hello!SpringBoot!";
    }
}

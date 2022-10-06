package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 Class 는 REST API 처리하는 Controller
@RequestMapping("/api")//주소처리, 주소할당하기위해 // requestMapping 은 URI를 지정해주는 anotation
public class ApiController {

    @GetMapping("/hello")//http://localhost:8080/api/hello
    public String hello(){
        return "hello spring boot!";
    }
}

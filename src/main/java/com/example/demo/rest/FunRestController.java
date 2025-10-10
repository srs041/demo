package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose a / endpoint that returns hello world
    @GetMapping("/")
    public String hello(){
        return  "Hello World!!!!!!October";
    }

    //exdpose a new endpoing for workout
    @GetMapping("/workout")
    public String workout(){
        return "Run 5k steps !!!";
    }

}

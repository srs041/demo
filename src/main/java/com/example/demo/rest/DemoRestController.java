package com.example.demo.rest;

import com.example.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach coach;

    @Autowired
    public DemoRestController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/")
    public String home(){
        return "Home";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
       return coach.getDailyWorkout();
    }
}

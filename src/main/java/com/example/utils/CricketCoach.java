package com.example.utils;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice Batting for 15 minutes";
    }
}

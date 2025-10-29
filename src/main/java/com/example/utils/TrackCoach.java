package com.example.utils;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice Running for 30 minutes";
    }
}

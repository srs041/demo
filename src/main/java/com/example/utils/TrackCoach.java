package com.example.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary--multiple primary not possible
public class TrackCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice Running for 30 minutes";
    }
}

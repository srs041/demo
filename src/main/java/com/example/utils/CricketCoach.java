package com.example.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Constructor :  "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Batting for 15 minutes";
    }
}

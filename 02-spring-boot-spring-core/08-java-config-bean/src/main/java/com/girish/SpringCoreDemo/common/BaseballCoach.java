package com.girish.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in batting practice";
    }

}

package com.girish.SpringCoreDemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k marathon";
    }

}

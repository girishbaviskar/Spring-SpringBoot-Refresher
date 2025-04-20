package com.girish.SpringCoreDemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }

}

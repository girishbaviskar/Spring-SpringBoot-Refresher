package com.girish.SpringCoreDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.girish.SpringCoreDemo.common.Coach;

@RestController
public class DemoRestController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoRestController(@Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;

    }

    @GetMapping("/getdailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: mycoach == anotherCoach,  " + (myCoach == anotherCoach);
    }
}

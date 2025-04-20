package com.girish.SpringCoreDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.girish.SpringCoreDemo.common.Coach;

@RestController
public class DemoRestController {
    private Coach myCoach;

    @Autowired
    public DemoRestController(@Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getName());
        myCoach = theCoach;

    }

    @GetMapping("/getdailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}

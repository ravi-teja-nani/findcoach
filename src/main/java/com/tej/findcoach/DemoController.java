package com.tej.findcoach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;

    @Autowired
    public DemoController (Coach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/daily-workout")
    public String getCDailyWorkout(){
        return myCoach.getDailyWorkout();
    };
}

package com.example.task_01.controller;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/greeting")
    public String newGreeting(@RequestParam String timeOfDay){
        Greeting greeting = new Greeting("Colin", timeOfDay);
        return "Good " + greeting.getTimeOfDay() + " " + greeting.getName();
    }

    @GetMapping(value = "/greeting/summer")
    public String summerGreeting() {
        Celebration celebration = new Celebration("Happy summer solstice!");
        return celebration.getMessage();
    }

}

package com.example.task_01.controller;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class Controller {

    @GetMapping
    public String newGreeting(){
        Greeting g = new Greeting("Colin", "Afternoon");
        return "Good " + g.getTimeOfDay() + " " + g.getName();
    }

}

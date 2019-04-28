package com.ansou.boot.MyFirstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${napa.name}")
    private String napaName;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World +++ " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String workout() {
        return "Run a hard 5K";
    }

    @GetMapping("/eating")
    public String eating() {
        return "Eat 2300 cals per day of workout not weekend";
    }

    @GetMapping("/bionte")
    public String bionte() {
        return "2 bionte time per day from behind";
    }

    @GetMapping("/football")
    public String football() {
        return "A game of 30 minutes";
    }

    @GetMapping("/Rugby")
    public String Rugby() {
        return "Play hard";
    }

    @GetMapping("/Tennis")
    public String Tennis() {
        return "Play hard";
    }

    @GetMapping("/napa")
    public String getNapaName() {
        return "The napa name is " + napaName;
    }
}

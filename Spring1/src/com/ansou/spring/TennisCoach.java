package com.ansou.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.processing.Generated;

@Component
@Lazy
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    private String email;
    private String teamName;

    public TennisCoach() {
        System.out.println("Creating an object TennisCoach");
    }


    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your left swing for 30 minutes then 30 minutes right";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setFortuneService");
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    void init() {
        System.out.println("Init function on Tennis Class");
    }

    @PreDestroy
    void delete() {
        System.out.println("Destructor function on Tennis Class");
    }
}

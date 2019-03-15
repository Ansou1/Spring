package com.ansou.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String teamName;

    public CricketCoach() {
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run and hit ball for 1 hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEmail() {
        return email;
    }

    public String getTeamName() {
        return teamName;
    }
}

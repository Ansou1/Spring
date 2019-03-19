package com.ansou.spring;

import org.springframework.beans.factory.annotation.Value;

public class HandballCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String mail;

    @Value("${foo.team}")
    private String team;

    public HandballCoach() {
    }

    public HandballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "100 shoot with wall";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

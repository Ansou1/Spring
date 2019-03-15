package com.ansou.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String teamName;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() { return "Run a hard 5K"; }

    @Override
    public String getDailyFortune() { return "Run forest, run...!!!"; }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // Add init method
    public void doMyStartupStuff() {
        System.out.println("Do strartup stuff");
    }

    // Add destroy method
    public void doMyCleanupStuff() {
        System.out.println("Do cleanup stuff");
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
}

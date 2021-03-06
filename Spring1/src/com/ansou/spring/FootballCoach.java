package com.ansou.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String teamName;

    public FootballCoach() {
    }

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() { return "Run 10 times around the field, then 100 penalty shoot training for everyone"; }

    @Override
    public String getDailyFortune() { return "You won't be Zidane in thee future"; }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("FootballCoach");
        this.fortuneService = fortuneService;
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

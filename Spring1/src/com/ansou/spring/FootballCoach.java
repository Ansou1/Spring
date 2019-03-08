package com.ansou.spring;

public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 10 times around the field, then 100 penalty shoot training for everyone";
    }
}

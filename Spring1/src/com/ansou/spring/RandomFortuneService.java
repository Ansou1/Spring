package com.ansou.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortune = {"First fortune", "Second fortune", "Third fortune"};

    @Override
    public String getFortune() {
        Random r = new Random();
        return fortune[r.nextInt(3)];
    }

}

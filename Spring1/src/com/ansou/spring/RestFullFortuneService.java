package com.ansou.spring;

import org.springframework.stereotype.Component;

@Component
public class RestFullFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Have a FULL DAY";
    }
}

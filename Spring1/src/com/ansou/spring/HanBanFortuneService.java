package com.ansou.spring;

public class HanBanFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is not bad but not good too...";
    }
}

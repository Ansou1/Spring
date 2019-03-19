package com.ansou.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfigActivity {

    @Bean
    public FortuneService HanBanFortuneService() {
        return new HanBanFortuneService();
    }

    @Bean
    public Coach newCoach() {
        return new HandballCoach(HanBanFortuneService());
    }
}

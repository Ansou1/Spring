package com.ansou.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ansou.spring")
public class SportConfig {

    void displayText() {
        System.out.println("Here is my file for the conf sport.");
    }
}

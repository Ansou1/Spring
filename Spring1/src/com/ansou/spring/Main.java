package com.ansou.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Load the conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve beans
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call methode on beans
        System.out.println(theCoach.getDailyWorkout());
        //close the context
        context.close();
        //
    }
}

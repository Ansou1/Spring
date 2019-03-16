package com.ansou.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        FortuneService fortuneService = new FortuneService() {
            @Override
            public String getFortune() {
                return "Cricket is the worst";
            }
        };

        //Load the conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve beans
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //call methode on beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("########## Before ###########");
        System.out.println(theCricketCoach.getDailyFortune());
        System.out.println(theCricketCoach.getDailyWorkout());
        ((CricketCoach) theCricketCoach).setFortuneService(fortuneService);
        System.out.println("########## After ############");
        System.out.println(theCricketCoach.getDailyFortune());


        System.out.println(((CricketCoach) theCricketCoach).getEmail());
        System.out.println(((CricketCoach) theCricketCoach).getTeamName());
        //close the context
        context.close();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach == alphaCoach);
        System.out.println(alphaCoach);
        System.out.println(theCoach);

        context.close();
        */

        //Read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}






































package com.ansou.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            //create object mapper
            ObjectMapper objectMapper = new ObjectMapper();
            //read JSON file and map/convert to Java POJO
            Student theStudent = objectMapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println("student => " + theStudent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

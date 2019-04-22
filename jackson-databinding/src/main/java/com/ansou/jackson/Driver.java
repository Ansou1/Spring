package com.ansou.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            //create object mapper
            ObjectMapper objectMapper = new ObjectMapper();
            //read JSON file and map/convert to Java POJO
            Student theStudent = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);

            System.out.println("FirstName of the student => " + theStudent.getFirstName());
            System.out.println("LastName of the student => " +theStudent.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

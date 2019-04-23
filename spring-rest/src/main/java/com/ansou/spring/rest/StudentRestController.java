package com.ansou.spring.rest;


import com.ansou.spring.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> myStudentList;

    @PostConstruct
    public void loadData() {
        myStudentList = new ArrayList<>();

        myStudentList.add(new Student("Simon", "Daguenet"));
        myStudentList.add(new Student("Eunju", "Shin"));
        myStudentList.add(new Student("Sohyeon", "Shin"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return myStudentList;
    }

    @GetMapping("/students/{studentID}")
    public Student getStudentByID(@PathVariable int studentID) {

        if ((studentID >= myStudentList.size()) || (studentID < 0))
            throw new StudentNotFoundException("Student have not been found with the id: " + studentID);

        return myStudentList.get(studentID);
    }



}

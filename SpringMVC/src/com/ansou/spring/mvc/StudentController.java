package com.ansou.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showFrom(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processFrom(@ModelAttribute("student") Student theStudent) {
        System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName() + " " + theStudent.getCountry());
        System.out.println("Best programing language: " + theStudent.getFavoriteLanguage());
        return "student-confirmation";
    }

}

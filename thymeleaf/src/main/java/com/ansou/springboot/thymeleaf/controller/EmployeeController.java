package com.ansou.springboot.thymeleaf.controller;

import com.ansou.springboot.thymeleaf.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> listOfEmployee;

    @PostConstruct
    private void loadData() {

        Employee firstEmployee = new Employee(1, "Eunju", "Shin", "enju@gmail.com");
        Employee secondEmployee = new Employee(2, "Sohyeon", "Shin", "sohyeon@gmail.com");
        Employee thirdEmployee = new Employee(3, "Simon", "Daguenet", "simon@gmail.com");

        listOfEmployee = new ArrayList<>();

        listOfEmployee.add(firstEmployee);
        listOfEmployee.add(secondEmployee);
        listOfEmployee.add(thirdEmployee);
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        theModel.addAttribute("listOfEmployees", listOfEmployee);
        return "list-employees";
    }

}

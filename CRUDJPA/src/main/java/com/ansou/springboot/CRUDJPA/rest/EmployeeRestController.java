package com.ansou.springboot.CRUDJPA.rest;

import com.ansou.springboot.CRUDJPA.entity.Employee;
import com.ansou.springboot.CRUDJPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getListOfEmployees() {
        return this.employeeService.getListOfEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        Employee theEmployee = this.employeeService.getEmployeeById(id);

        if (theEmployee == null)
            throw new RuntimeException("Employee is not found for the id:" + id);
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee saveEmployees(@RequestBody Employee employee) {
        employee.setId(0);
        this.employeeService.saveEmployees(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        this.employeeService.saveEmployees(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployees(@PathVariable int id) {

        Employee theEmployee = this.employeeService.getEmployeeById(id);

        if (theEmployee == null)
            throw new RuntimeException("Employee is not found for the id: " + id);

        this.employeeService.deleteEmployees(id);
        return "The employee id: " + id + " have been deleted";
    }
}

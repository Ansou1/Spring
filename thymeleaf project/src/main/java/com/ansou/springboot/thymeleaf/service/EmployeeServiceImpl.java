package com.ansou.springboot.thymeleaf.service;

import com.ansou.springboot.thymeleaf.dao.EmployeeRepository;
import com.ansou.springboot.thymeleaf.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> employee = this.employeeRepository.findById(id);

        Employee theEmployee = null;

        if (employee.isPresent()) {
            theEmployee = employee.get();
        } else {
            throw new RuntimeException("The employee is was not found , id => " + id);
        }
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        this.employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int id) {
        this.employeeRepository.deleteById(id);
    }
}

package com.ansou.springboot.CRUDJPA.service;

import com.ansou.springboot.CRUDJPA.DAO.EmployeeRepository;
import com.ansou.springboot.CRUDJPA.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        this.employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> getListOfEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);

        Employee theEmployee = null;

        if (byId.isPresent()) {
            theEmployee = byId.get();
        } else {
            throw new RuntimeException("Did not find employee id:" + id);
        }
        return theEmployee;
    }

    @Override
    public void saveEmployees(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployees(int id) {
        employeeRepository.deleteById(id);
    }
}

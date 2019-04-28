package com.ansou.springboot.CRUD.service;

import com.ansou.springboot.CRUD.DAO.EmployeeDAO;
import com.ansou.springboot.CRUD.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getListOfEmployees() {
        return employeeDAO.getListOfEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void saveEmployees(Employee employee) {
        employeeDAO.saveEmployees(employee);
    }

    @Override
    @Transactional
    public void deleteEmployees(int id) {
        employeeDAO.deleteEmployees(id);
    }
}

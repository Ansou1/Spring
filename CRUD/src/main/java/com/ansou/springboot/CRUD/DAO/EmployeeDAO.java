package com.ansou.springboot.CRUD.DAO;

import com.ansou.springboot.CRUD.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getListOfEmployees();
    public Employee getEmployeeById(int id);
    public void saveEmployees(Employee employee);
    public void deleteEmployees(int id);

}

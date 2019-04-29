package com.ansou.springboot.CRUDJPA.DAO;

import com.ansou.springboot.CRUDJPA.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getListOfEmployees();
    public Employee getEmployeeById(int id);
    public void saveEmployees(Employee employee);
    public void deleteEmployees(int id);

}

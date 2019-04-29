package com.ansou.springboot.CRUDJPA.DAO;

import com.ansou.springboot.CRUDJPA.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getListOfEmployees() {
        Query query = entityManager.createQuery("FROM Employee");
        List<Employee> listOfEmployees = query.getResultList();
        return listOfEmployees;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void saveEmployees(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee);
        theEmployee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteEmployees(int theId) {
        Query query = entityManager.createQuery("DELETE FROM Employee WHERE id=:employeeId");
        query.setParameter("employeeId", theId);
        query.executeUpdate();
    }
}

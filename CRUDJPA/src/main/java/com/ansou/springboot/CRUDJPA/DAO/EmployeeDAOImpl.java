package com.ansou.springboot.CRUDJPA.DAO;

import com.ansou.springboot.CRUDJPA.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getListOfEmployees() {
        Session session = entityManager.unwrap(Session.class);
        Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Employee.class, id);
    }

    @Override
    public void saveEmployees(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployees(int id) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(id);
    }
}

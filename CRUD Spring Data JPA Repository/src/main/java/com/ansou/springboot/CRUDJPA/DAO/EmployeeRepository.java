package com.ansou.springboot.CRUDJPA.DAO;

import com.ansou.springboot.CRUDJPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

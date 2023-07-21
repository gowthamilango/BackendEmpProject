package com.getthemarvel.springbootcrudpractice1.repository;

import com.getthemarvel.springbootcrudpractice1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByFirstName(String name);
}


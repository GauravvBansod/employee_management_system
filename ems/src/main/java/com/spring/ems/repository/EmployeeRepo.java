package com.spring.ems.repository;

import com.spring.ems.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    // search function
   public List<Employee> findByNameContainingIgnoreCase(String name);

}

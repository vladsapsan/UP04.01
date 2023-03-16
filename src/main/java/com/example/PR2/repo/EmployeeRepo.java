package com.example.PR2.repo;

import com.example.PR2.Models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee,Long> {
    List<Employee> findByNameContains(String name);
    List<Employee> findByName(String name);
    Employee findById(long id);
    Employee deleteById(long id);
}

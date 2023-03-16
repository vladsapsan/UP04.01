package com.example.PR2.repo;

import com.example.PR2.Models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer,Long> {
    List<Customer> findByNameContains(String name);
    List<Customer> findByName(String name);
    Customer findById(long id);
    Customer deleteById(long id);
}

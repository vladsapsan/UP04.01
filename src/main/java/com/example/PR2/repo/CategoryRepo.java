package com.example.PR2.repo;

import com.example.PR2.Models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
    Category findByName(String name);
}

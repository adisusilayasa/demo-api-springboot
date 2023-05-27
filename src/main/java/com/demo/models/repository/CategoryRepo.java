package com.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.models.entity.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {
    
}

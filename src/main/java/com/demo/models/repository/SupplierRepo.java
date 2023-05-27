package com.demo.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.models.entity.Supplier;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {
    
}

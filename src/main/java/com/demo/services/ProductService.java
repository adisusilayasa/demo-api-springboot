package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.models.entity.Product;
import com.demo.models.entity.Supplier;
import com.demo.models.repository.ProductRepo;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Cacheable(value = "products")
    public Product create(Product product) {
        return productRepo.save(product);
    }

    @Cacheable(value = "products")
    public Product findOne(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    @Cacheable(value = "products")
    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }

    @Cacheable(value = "products")
    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public void addSupplier(Supplier supplier, Long productId) {
        Product product = findOne(productId);
        if (product == null) {
            throw new RuntimeException("Product not found");
        }

        product.getSuppliers().add(supplier);
        save(product);
    }

}

package com.springjpa.springbootonetomany.repository;

import com.springjpa.springbootonetomany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

package com.rajan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajan.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}

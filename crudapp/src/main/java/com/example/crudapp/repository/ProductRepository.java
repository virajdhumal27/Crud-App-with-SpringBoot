package com.example.crudapp.repository;

import com.example.crudapp.entity.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}

package com.example.crudapp.repositoryservices;

import java.util.List;

import com.example.crudapp.dto.Product;

public interface GetProductRepositoryService {
    List<Product> findAllProducts();
}

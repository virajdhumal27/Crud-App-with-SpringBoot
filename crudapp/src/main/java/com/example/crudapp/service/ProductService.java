package com.example.crudapp.service;

import com.example.crudapp.entity.Product;
import com.example.crudapp.exchanges.GetProductResponse;

public interface ProductService {

    void addProduct(Product product);

    GetProductResponse getProducts();
    
}

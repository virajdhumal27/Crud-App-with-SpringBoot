package com.example.crudapp.service;

import java.util.ArrayList;
import java.util.List;

import com.example.crudapp.entity.Product;
// import com.example.crudapp.repository.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    // private ProductRepository repository;
    List<Product> products;

    ProductService() {
        products = new ArrayList<>();
        Product mobile = new Product(1, "Mobile", 1, 15000);
        Product television = new Product(2, "Television", 5, 50000);
        Product speaker = new Product(3, "Speaker", 2, 10000);

        products.add(mobile);
        products.add(television);
        products.add(speaker);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

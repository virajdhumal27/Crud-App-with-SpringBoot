package com.example.crudapp.service;

import java.util.List;

import com.example.crudapp.entity.Product;
import com.example.crudapp.exchanges.GetProductResponse;
import com.example.crudapp.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public GetProductResponse getProducts() {
        List<Product> products = productRepository.findAll();
        return new GetProductResponse(products);
    }
    
}

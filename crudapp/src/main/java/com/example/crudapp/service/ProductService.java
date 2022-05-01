package com.example.crudapp.service;

import java.util.ArrayList;
import java.util.List;

import com.example.crudapp.dto.Products;
import com.example.crudapp.exchanges.GetProductResponse;

// import com.example.crudapp.repository.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    // private ProductRepository repository;
    List<Products> products;

    ProductService() {
        if (products != null) {
            products = new ArrayList<>();
            
            products.add(new Products(1, "IPHONE 13", 5, 900, "Apple", 0));
            products.add(new Products(2, "Samsung Note Pro", 22, 590, "Samsung", 0));
            products.add(new Products(3, "IPHONE 12", 9, 850, "Apple", 0));
            products.add(new Products(4, "Xaomi MI A3", 6, 700, "Xaomi", 0));
            products.add(new Products(5, "Oppo Note 5", 5, 520, "Oppo", 0));
        }
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public GetProductResponse getProducts() {

        for (Products product : products) {
            product.setTotalPrice(product.getPrice() * product.getQuantity());
        }

        return new GetProductResponse(products);
    }

    public GetProductResponse getProductsByCompanyName(String company) {
        List<Products> required = new ArrayList<>();

        for (Products product : products) {
            if (product.getCompany().equals(company)) {
                product.setTotalPrice(product.getPrice() * product.getQuantity());
                required.add(product);
            }
        }

        System.out.println(required);

        return new GetProductResponse(required);
    }
}

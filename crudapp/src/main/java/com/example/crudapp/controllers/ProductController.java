package com.example.crudapp.controllers;

import com.example.crudapp.exchanges.GetProductResponse;
import com.example.crudapp.service.GetProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProductController {

    public static final String GET_ALL_PRODUCTS = "/getAllProducts";

    @Autowired
    private GetProductService getProductService;

    @GetMapping(GET_ALL_PRODUCTS)
    public GetProductResponse getAllProducts() {
        
        GetProductResponse getProductResponse = getProductService.getAllProducts();

        return getProductResponse;
    }
    
}

package com.example.crudapp.controllers;

import com.example.crudapp.exchanges.GetProductResponse;
import com.example.crudapp.service.GetProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping(ProductController.PRODUCTS_API_ENDPOINT)
public class ProductController {

    public static final String PRODUCTS_API_ENDPOINT = "/products";
    public static final String GET_ALL_PRODUCTS_API = "/allProducts";
    public static final String GET_PRODUCTS_BY_COMPANY_API = "/company/{company}";

    @Autowired
    private GetProductService getProductService;

    @GetMapping(GET_ALL_PRODUCTS_API)
    public GetProductResponse getAllProducts() {
        
        GetProductResponse getProductResponse = getProductService.getAllProducts();

        return getProductResponse;
    }

    @GetMapping(GET_PRODUCTS_BY_COMPANY_API)
    public GetProductResponse getProductsByCompany(@PathVariable String company) {
        GetProductResponse getProductResponse = getProductService.getProductsByCompany(company);
        return getProductResponse;
    }
    
}

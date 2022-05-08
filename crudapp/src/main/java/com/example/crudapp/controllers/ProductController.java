package com.example.crudapp.controllers;

import com.example.crudapp.entity.Product;
import com.example.crudapp.exchanges.GetProductResponse;
import com.example.crudapp.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProductController {

    public static final String ADD_PRODUCT_API = "/addProduct";
    public static final String GET_ALL_PRODUCTS_API = "/getProducts";
    public static final String GET_PRODUCTS_BY_COMPANY_NAME_API = "/getProductsByCompany";

    @Autowired
    private ProductService productService;
    
    @GetMapping("/hello")
    public String welcome() {
        return "Hello World!";
    }

    @GetMapping("/name")
    public String welcomeUser(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping(ADD_PRODUCT_API)
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping(GET_ALL_PRODUCTS_API)
    public GetProductResponse getProducts() {
        GetProductResponse getProductResponse = productService.getProducts();
        return getProductResponse;
    }

    // @PostMapping(GET_PRODUCTS_BY_COMPANY_NAME_API)
    // public GetProductResponse getProductsByCompanyName(@RequestBody GetProductRequest getProductRequest) {
    //     String company = getProductRequest.getCompany();
    //     System.out.println(company);
    //     GetProductResponse getProductResponse = productService.getProductsByCompanyName(company);
    //     return getProductResponse;
    // }
}

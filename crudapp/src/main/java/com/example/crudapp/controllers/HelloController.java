package com.example.crudapp.controllers;

import java.util.List;

import com.example.crudapp.entity.Product;
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
public class HelloController {

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

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}

package com.example.crudapp.service;

import com.example.crudapp.exchanges.GetProductResponse;

public interface GetProductService {
    GetProductResponse getAllProducts();
    GetProductResponse getProductsByCompany(String company);
}

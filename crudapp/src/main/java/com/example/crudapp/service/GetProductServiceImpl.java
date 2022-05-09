package com.example.crudapp.service;

import java.util.List;

import com.example.crudapp.dto.Product;
import com.example.crudapp.exchanges.GetProductResponse;
import com.example.crudapp.repositoryservices.GetProductRepositoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProductServiceImpl implements GetProductService{

    @Autowired
    private GetProductRepositoryService getProductRepositoryService;

    @Override
    public GetProductResponse getAllProducts() {

        List<Product> products = getProductRepositoryService.findAllProducts();

        for(Product product: products) {
            Integer price = product.getPrice();
            Integer quantity = product.getQuantity();
            Integer totalPrice = price * quantity;

            product.setTotalPrice(totalPrice);
        }

        GetProductResponse getProductResponse = new GetProductResponse(products);
        return getProductResponse;
    }
    
}

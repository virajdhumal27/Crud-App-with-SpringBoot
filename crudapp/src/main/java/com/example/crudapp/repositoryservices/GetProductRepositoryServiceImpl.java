package com.example.crudapp.repositoryservices;

import java.util.ArrayList;
import java.util.List;

import com.example.crudapp.dto.Product;
import com.example.crudapp.entity.ProductEntity;
import com.example.crudapp.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProductRepositoryServiceImpl implements GetProductRepositoryService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();

        List<Product> products = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            products.add(getInFormOfProduct(productEntity));
        }
        return products;
    }

    private Product getInFormOfProduct(ProductEntity productEntity) {
        Integer productId = productEntity.getProductId();
        String productName = productEntity.getProductName();
        Integer price = productEntity.getPrice();
        Integer quantity = productEntity.getQuantity();
        String company = productEntity.getCompany();

        Product product = new Product(productId, productName, quantity, price, company, 0);
        return product;
    }

    @Override
    public List<Product> findProductsByCompany(String company) {

        List<ProductEntity> productEntities = productRepository.findByCompany(company);

        List<Product> products = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            products.add(getInFormOfProduct(productEntity));
        }
        return products;
    }
    
}

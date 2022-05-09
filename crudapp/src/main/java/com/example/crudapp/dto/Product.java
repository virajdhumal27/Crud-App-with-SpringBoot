package com.example.crudapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer product_id;
    private String name;
    private Integer quantity;
    private Integer price;
    private String company;
    private Integer totalPrice;
}

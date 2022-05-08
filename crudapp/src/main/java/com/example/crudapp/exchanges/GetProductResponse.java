package com.example.crudapp.exchanges;

import java.util.List;

import com.example.crudapp.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {
    List<Product> products;
}

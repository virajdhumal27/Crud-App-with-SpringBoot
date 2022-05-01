package com.example.crudapp.exchanges;

import java.util.List;

import com.example.crudapp.dto.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {
    List<Products> products;
}

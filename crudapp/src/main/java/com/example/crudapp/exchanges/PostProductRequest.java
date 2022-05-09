package com.example.crudapp.exchanges;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostProductRequest {
    private String product_name;
    private Integer quantity;
    private Integer price;
    private String company;
}

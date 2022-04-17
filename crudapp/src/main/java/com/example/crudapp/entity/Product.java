package com.example.crudapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_table")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private int quantity;
    @Column
    private double price;
}

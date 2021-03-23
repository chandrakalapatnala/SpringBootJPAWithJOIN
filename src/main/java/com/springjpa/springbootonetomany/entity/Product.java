package com.springjpa.springbootonetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product{

    @Id
    private int productId;

    private int quantity;

    private String productName;

    private double productPrice;

}

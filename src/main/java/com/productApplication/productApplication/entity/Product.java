package com.productApplication.productApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private  int quantity;
    private double price;
}

//https://github.com/BasavarajBurali/Product.git
//git remote add origin https://github.com/BasavarajBurali/Product.git
//git remote set-url origin https://github.com/BasavarajBurali/Product.git
//am not getting this file
//aefefq
//dsfiwb
//SDBIv
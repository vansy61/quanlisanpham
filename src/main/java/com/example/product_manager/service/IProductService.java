package com.example.product_manager.service;

import com.example.product_manager.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product customer);

    Product findById(int id);

    void update(int id, Product customer);

    void remove(int id);
}

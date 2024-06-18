package com.example.product_manager.service;

import com.example.product_manager.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "SP 01", 30000, "Mô tả SP 01", "Hai Phong"));
        products.put(2, new Product(2, "SP 02", 40000, "Mô tả SP 02", "Hai Phong"));
        products.put(3, new Product(3, "SP 03", 50000, "Mô tả SP 03", "Hai Phong"));
        products.put(4, new Product(4, "SP 04", 60000, "Mô tả SP 04", "Hai Phong"));
        products.put(5, new Product(5, "SP 05", 70000, "Mô tả SP 05", "Hai Phong"));
        products.put(6, new Product(6, "SP 06", 80000, "Mô tả SP 06", "Hai Phong"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id, customer);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}

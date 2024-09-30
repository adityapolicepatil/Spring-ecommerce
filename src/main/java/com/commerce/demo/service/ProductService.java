package com.commerce.demo.service;

import com.commerce.demo.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductService {

    public List<Product> getAllProducts() {
        return repo.AllProducts;
    }
}

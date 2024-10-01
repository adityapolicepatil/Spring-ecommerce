package com.commerce.demo.repo;

import com.commerce.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

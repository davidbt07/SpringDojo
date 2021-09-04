package com.example.demo.service;

public interface ProductService {

    List<Product> getProducts();
    Product addProduct(Product product) throws ResourceAlreadyFound;
    boolean existProduct(Long id);
}

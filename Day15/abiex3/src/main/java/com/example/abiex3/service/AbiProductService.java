// ProductService.java
package com.example.abicw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abicw1.model.AbiProduct;
import com.example.abicw1.repository.AbiProductRepo;

import java.util.List;

@Service
public class AbiProductService {

    private final AbiProductRepo productRepo;

    @Autowired
    public AbiProductService(AbiProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public AbiProduct createProduct(AbiProduct product) {
        return productRepo.save(product);
    }

    public List<AbiProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public AbiProduct getProductById(int id) {
        return productRepo.findById(id);
    }

    public AbiProduct updateProduct(int id, AbiProduct updatedProduct) {
        AbiProduct existingProduct = getProductById(id);
        if (existingProduct != null) {
            updatedProduct.setId(id);
            return productRepo.save(updatedProduct);
        }
        return null;
    }

    public void deleteProductById(int id) {
        productRepo.deleteById(id);
    }
}

// ProductRepo.java
package com.example.abicw1.repository;

import org.springframework.stereotype.Repository;

import com.example.abicw1.model.AbiProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AbiProductRepo {

    // Simulated in-memory database
    private final Map<Integer, AbiProduct> products = new HashMap<>();
    private int idCounter = 1;

    public AbiProduct save(AbiProduct product) {
        if (product.getId() == 0) {
            product.setId(idCounter++);
        }
        products.put(product.getId(), product);
        return product;
    }

    public List<AbiProduct> findAll() {
        return new ArrayList<>(products.values());
    }

    public AbiProduct findById(int id) {
        return products.get(id);
    }

    public void deleteById(int id) {
        products.remove(id);
    }
}

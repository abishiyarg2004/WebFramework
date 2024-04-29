// ProductController.java
package com.example.abicw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.abicw1.model.AbiProduct;
import com.example.abicw1.service.AbiProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class AbiProductController {

    private final AbiProductService productService;

    @Autowired
    public AbiProductController(AbiProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<AbiProduct> createProduct(@RequestBody AbiProduct product) {
        AbiProduct createdProduct = productService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AbiProduct>> getAllProducts() {
        List<AbiProduct> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AbiProduct> getProductById(@PathVariable int id) {
        AbiProduct product = productService.getProductById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<AbiProduct> updateProduct(@PathVariable int id, @RequestBody AbiProduct updatedProduct) {
        AbiProduct product = productService.updateProduct(id, updatedProduct);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable int id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

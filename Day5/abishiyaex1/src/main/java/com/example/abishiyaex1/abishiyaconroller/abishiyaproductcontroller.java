package com.example.abishiyaex1.abishiyaconroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.abishiyaex1.abishiyamodel.abishiyaproductmodel;
import com.example.abishiyaex1.abishiyaservice.abishiyaproductservice;

@RestController
public class abishiyaproductcontroller {

    public abishiyaproductservice productService;
    public abishiyaproductcontroller(abishiyaproductservice productService)
    {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public ResponseEntity<abishiyaproductmodel> postMethodName(@RequestBody abishiyaproductmodel product) {
        if(productService.saveProduct(product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/api/product/{productId}")
    public ResponseEntity<abishiyaproductmodel> putMethodName(@PathVariable("productId") int id, @RequestBody abishiyaproductmodel product) {
        if(productService.updateDetails(id,product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("api/product/{productId}")
    public ResponseEntity<abishiyaproductmodel> delete(@PathVariable("productId") int id,@RequestBody abishiyaproductmodel product)
    {
        if(productService.deleteProduct(id) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}

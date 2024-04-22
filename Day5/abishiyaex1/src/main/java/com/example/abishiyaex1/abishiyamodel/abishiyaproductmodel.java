package com.example.abishiyaex1.abishiyamodel;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class abishiyaproductmodel {
    @Id
    private int productId;
    private String productName;
    private String productDescription;
    
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}

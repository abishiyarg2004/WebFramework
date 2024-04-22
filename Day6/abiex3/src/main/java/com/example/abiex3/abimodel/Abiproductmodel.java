package com.example.abiex3.abimodel;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Abiproductmodel {

    @Id
    private int productId;
    private String productName;
    private String category;
    private int price;
   
   
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
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}




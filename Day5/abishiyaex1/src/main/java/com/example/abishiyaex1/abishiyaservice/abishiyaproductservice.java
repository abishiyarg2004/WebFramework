package com.example.abishiyaex1.abishiyaservice;

import org.springframework.stereotype.Service;

import com.example.abishiyaex1.abishiyamodel.abishiyaproductmodel;
import com.example.abishiyaex1.abishiyarepository.abishiyaproductrepository;



@Service
public class abishiyaproductservice {
    public abishiyaproductrepository productRepo;
    public abishiyaproductservice(abishiyaproductrepository productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(abishiyaproductmodel product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,abishiyaproductmodel product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public abishiyaproductmodel getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

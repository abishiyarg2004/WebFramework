package com.example.abiex3.abiservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abiex3.abimodel.Abiproductmodel;
import com.example.abiex3.abirepo.Abiproductrepo;

@Service
public class Abiproductservice {

    public Abiproductrepo productRepo;
    public Abiproductservice(Abiproductrepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(Abiproductmodel product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Abiproductmodel> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<Abiproductmodel> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public Abiproductmodel getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}



package com.example.abiex3.abiservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abiex3.abimodel.Abidoormodel;
import com.example.abiex3.abirepo.Abidoorrepo;

@Service
public class Abidoorservice {

    @Autowired
    private Abidoorrepo rep;

    public boolean post(Abidoormodel door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Abidoormodel> getAll()
    {
        return rep.findAll();
    }

    public List<Abidoormodel> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<Abidoormodel> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}


package com.example.abiex3.abiservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.abiex3.abimodel.abilanguagemodel;
import com.example.abiex3.abirepo.abilanguagerepo;

@Service
public class abilanguageservice {

    private abilanguagerepo languageRepo;
    public abilanguageservice(abilanguagerepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(abilanguagemodel language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<abilanguagemodel> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,abilanguagemodel language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public abilanguagemodel getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }
}

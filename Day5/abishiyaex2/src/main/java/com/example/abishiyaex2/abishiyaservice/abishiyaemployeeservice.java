package com.example.abishiyaex2.abishiyaservice;

import com.example.abishiyaex2.abishiyamodel.abishiyaemployeemodel;
import com.example.abishiyaex2.abishiyarepo.abishiyaemployeerepository;

public class abishiyaemployeeservice {

    public  abishiyaemployeerepository employeeRepo;
    public abishiyaemployeeservice(abishiyaemployeerepository employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(abishiyaemployeemodel employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,abishiyaemployeemodel employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public abishiyaemployeemodel getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}

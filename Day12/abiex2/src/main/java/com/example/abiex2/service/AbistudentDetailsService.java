package com.example.abiex2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.abiex2.model.AbiStudentDetailsModel;
import com.example.abiex2.model.AbiStudentModel;
import com.example.abiex2.repository.AbiStudentDetailsRepo;
import com.example.abiex2.repository.AbiStudentRepo;

public class AbistudentDetailsService {

     @Autowired
    AbiStudentDetailsRepo r;
    @Autowired
    AbiStudentRepo rep;

    public AbiStudentDetailsModel post(AbiStudentDetailsModel s,int id)
    {
        AbiStudentModel stu = rep.findById(id); 
        stu.setStudentDetail(s);
        rep.save(stu);
        return s;
    }

}

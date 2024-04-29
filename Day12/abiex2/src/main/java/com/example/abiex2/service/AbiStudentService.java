package com.example.abiex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.abiex2.model.AbiStudentDetailsModel;
import com.example.abiex2.model.AbiStudentModel;
import com.example.abiex2.repository.AbiStudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

public class AbiStudentService {

     @Autowired
    AbiStudentRepo r;

    private EntityManager entityManager;

    public AbiStudentService(EntityManager entityManager) 
    {
        this.entityManager = entityManager;
    }

    public AbiStudentModel post(AbiStudentModel s)
    {
        return r.save(s);
    }

    public List<AbiStudentModel> innerjoin()
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<AbiStudentModel> criteriaQuery = criteriaBuilder.createQuery(AbiStudentModel.class);

        Root<AbiStudentModel> studentRoot = criteriaQuery.from(AbiStudentModel.class);
        Join<AbiStudentModel, AbiStudentDetailsModel> studentJoin = studentRoot.join("studentDetail",JoinType.INNER);

        criteriaQuery.select(studentRoot);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public List<AbiStudentModel> leftjoin()
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<AbiStudentModel> criteriaQuery = criteriaBuilder.createQuery(AbiStudentModel.class);

        Root<AbiStudentModel> studentRoot = criteriaQuery.from(AbiStudentModel.class);
        Join<AbiStudentModel, AbiStudentDetailsModel> studentJoin = studentRoot.join("studentDetail",JoinType.LEFT);

        criteriaQuery.select(studentRoot);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}



package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.StudentInfo;

@Repository
public interface AbiStudentInfoRepository extends JpaRepository<StudentInfo,Integer>{
    
}
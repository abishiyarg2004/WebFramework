package com.example.abiex2.abirepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abiex2.abimodel.Abicoursemodel;
import java.util.List;


public interface Abicourserepo extends JpaRepository<Abicoursemodel,Integer> {

    List<Abicoursemodel> findByCourseName(String courseName);
}

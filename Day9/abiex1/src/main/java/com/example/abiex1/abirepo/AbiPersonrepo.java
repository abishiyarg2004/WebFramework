package com.example.springapp.abirepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.abimodel.AbiPerson;

public interface AbiPersonrepo extends JpaRepository<AbiPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<AbiPerson> findByAge(int age);
}

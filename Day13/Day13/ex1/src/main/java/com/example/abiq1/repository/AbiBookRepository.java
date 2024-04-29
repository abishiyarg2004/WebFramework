package com.example.abiq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.abiq1.model.AbiBook;
@Repository
public interface AbiBookRepository extends JpaRepository<AbiBook, Long> {
}

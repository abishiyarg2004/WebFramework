package com.example.abicw2.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abicw2.model.AbiBook;

public interface AbiBookRepo extends JpaRepository<AbiBook, Long> {
}


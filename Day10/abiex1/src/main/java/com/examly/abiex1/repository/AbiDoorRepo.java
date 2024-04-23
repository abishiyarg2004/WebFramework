package com.examly.ex1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.ex1.abimodel.AbiDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface AbiDoorRepo extends JpaRepository<AbiDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<AbiDoor> findByColor(String color);

    public List<AbiDoor> findByDoorType(String doortype);
}

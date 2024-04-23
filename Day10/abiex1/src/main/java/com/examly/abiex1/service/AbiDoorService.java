package com.examly.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.ex1.abimodel.AbiDoor;
import com.examly.ex1.repository.AbiDoorRepo;

@Service
public class AbiDoorService {
    @Autowired
    private AbiDoorRepo doorRepo;

    public AbiDoor postData(AbiDoor door) {
        return doorRepo.save(door);
    }

    public List<AbiDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AbiDoor updateDetail(int doorid, AbiDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AbiDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AbiDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AbiDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}
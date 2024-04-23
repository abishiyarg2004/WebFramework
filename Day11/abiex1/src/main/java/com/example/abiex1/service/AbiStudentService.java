package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.Student;
import com.example.bidirection.model.StudentInfo;
import com.example.bidirection.repository.StudentInfoRepository;
import com.example.bidirection.repository.StudentRepository;

@Service
public class AbiStudentService {
    public AbiStudentRepository studentRepository;
    public AbiStudentInfoRepository studentInfoRepository;
    public AbiStudentService(AbiStudentRepository studentRepository,AbiStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AbiStudent saveStudent(AbiStudent student)
    {
        return studentRepository.save(student);
    }
    public AbiStudentInfo saveStudentInfo(AbiStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AbiStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}

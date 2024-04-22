package com.example.abiex1.abirepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.abiex1.abimodel.Abipersonmodel;
import java.util.List;


public interface Abipersonrepo  extends JpaRepository<Abipersonmodel,Integer>{

    List<Abipersonmodel> findByAge(int age);
}

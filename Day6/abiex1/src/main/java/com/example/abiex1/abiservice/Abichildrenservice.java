package com.example.abiex1.abiservice;

import java.util.List;
import org.springframework.data.domain.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abiex1.abimodel.Abichildrenmodel;
import com.example.abiex1.abirepo.Abichildrenrepository;

@Service
public class Abichildrenservice  {
    @Autowired
    public Abichildrenrepository childrenRepo;

    public List<Abichildrenmodel> sort(String field) {
         return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
    }

    public Abichildrenmodel save(Abichildrenmodel children) {
         return childrenRepo.save(children);

    }

    public List<Abichildrenmodel> sortedPage(int offset, int pagesize, String field) {
         Page<Abichildrenmodel> sortedPage = childrenRepo
                   .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
         return sortedPage.getContent();
    }

    public List<Abichildrenmodel> pagination(int offset, int pagesize) {
         Page<Abichildrenmodel> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
         return pages.getContent();

    }

}

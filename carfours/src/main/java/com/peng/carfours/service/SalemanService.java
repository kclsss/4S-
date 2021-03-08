package com.peng.carfours.service;


import com.peng.carfours.mapper.SalemanMapper;
import com.peng.carfours.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalemanService {

    @Autowired
    private SalemanMapper salemanMapper;

    public List<People> allSeller(){
        return salemanMapper.AllSeller();
    }

    public People queryById(int id){
        return salemanMapper.queryById(id);
    }

    public void addSaleman(People people){
        salemanMapper.addSaleman(people);
    }

    public void updateSaleman(People people){
        salemanMapper.updateSaleman(people);
    }

    public void deleteSaleman(int id){
        salemanMapper.deleteSaleman(id);
    }
}

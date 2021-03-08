package com.peng.carfours.service;


import com.peng.carfours.mapper.SalemanMapper;
import com.peng.carfours.mapper.SellMapper;
import com.peng.carfours.pojo.People;
import com.peng.carfours.pojo.SellCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellService {

    @Autowired
    private SellMapper sellMapper;

    public List<SellCar> AllSellcar(){
        return sellMapper.AllSellcar();
    }




}

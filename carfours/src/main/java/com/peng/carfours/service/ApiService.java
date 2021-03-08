package com.peng.carfours.service;


import com.peng.carfours.mapper.ApiMapper;
import com.peng.carfours.mapper.SellMapper;
import com.peng.carfours.pojo.SellCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class ApiService {

    @Autowired
    private ApiMapper apiMapper;

   public List CarSell(){
       return apiMapper.CarSell();
   }

   public List CarMaintain(){
       return apiMapper.CarMaintain();
   }

   public int CarSellNum(){
       return apiMapper.CarSellNum();
   }

   public int AllCar(){
       return apiMapper.AllCae();
   }

   public BigDecimal Sales(){
       return apiMapper.sales();
   }




}

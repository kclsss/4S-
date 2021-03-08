package com.peng.carfours.service;


import com.peng.carfours.mapper.NotSellMapper;
import com.peng.carfours.mapper.SellMapper;
import com.peng.carfours.pojo.Carmessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class NotSellService {

    @Autowired
    private NotSellMapper notSellMapper;

    public List<Carmessage> notSellcar(){
        return notSellMapper.notSellcar();
    }


    public void sellcar(Carmessage carmessage){
        carmessage.setSell_time(new Timestamp(System.currentTimeMillis()));;
        notSellMapper.sellcar(carmessage);
    }

}

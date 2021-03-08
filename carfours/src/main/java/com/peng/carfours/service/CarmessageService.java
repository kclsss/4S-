package com.peng.carfours.service;


import com.peng.carfours.mapper.CarmessageMapper;
import com.peng.carfours.mapper.CustomerMapper;
import com.peng.carfours.pojo.Carmessage;
import com.peng.carfours.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarmessageService {

    @Autowired
    private CarmessageMapper carmessageMapper;

    public List<Carmessage> allCarmessage(){
        return carmessageMapper.AllCarmessqge();
    }

    public Carmessage queryById(int id){
        return carmessageMapper.queryById(id);
    }

    public void addCarmessage(Carmessage carmessage){
        carmessageMapper.addCarmessqge(carmessage);
    }

    public void updateCarmessage(Carmessage carmessage){
        carmessageMapper.updateCarmessage(carmessage);
    }

    public void deleteCarmessage(int id){
        carmessageMapper.deleteCarmessage(id);
    }
}

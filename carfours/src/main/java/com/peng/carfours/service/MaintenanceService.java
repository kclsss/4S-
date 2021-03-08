package com.peng.carfours.service;


import com.peng.carfours.mapper.MaintenanceMapper;
import com.peng.carfours.pojo.Maintain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceMapper maintenanceMapper;

    public List<Maintain> AllSellcar(){
        return maintenanceMapper.AllMaintain();
    }

    public void addMaintance(Maintain maintain){
        maintenanceMapper.addMaintain(maintain);
    }




}

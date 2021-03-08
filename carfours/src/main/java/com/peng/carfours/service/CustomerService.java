package com.peng.carfours.service;


import com.peng.carfours.mapper.CustomerMapper;
import com.peng.carfours.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public List<People> allCustomer(){
        return customerMapper.AllCustomer();
    }

    public People queryById(int id){
        return customerMapper.queryById(id);
    }

    public int count(){
        return customerMapper.count();
    }

    public void addCustomer(People people){
        customerMapper.addCustomer(people);
    }

    public void updateCustomer(People people){
        customerMapper.updateCustomer(people);
    }

    public void deleteCustomer(int id){
        customerMapper.deleteCustomer(id);
    }
}

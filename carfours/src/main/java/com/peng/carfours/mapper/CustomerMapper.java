package com.peng.carfours.mapper;


import com.peng.carfours.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerMapper {

    List<People> AllCustomer();

    People queryById(int id);

    int count();

    void addCustomer(People people);

    void updateCustomer(People people);

    void deleteCustomer(int id);

}

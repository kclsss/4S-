package com.peng.carfours.mapper;


import com.peng.carfours.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SalemanMapper {

    List<People> AllSeller();

    People queryById(int id);

    void addSaleman(People people);

    void updateSaleman(People people);

    void deleteSaleman(int id);

}

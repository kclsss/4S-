package com.peng.carfours.mapper;


import com.peng.carfours.pojo.People;
import com.peng.carfours.pojo.SellCar;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SellMapper {

    List<SellCar> AllSellcar();

}

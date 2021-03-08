package com.peng.carfours.mapper;


import com.peng.carfours.pojo.Carmessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ApiMapper {
    List CarSell();//售车info,车辆销售占比
    List CarMaintain();//保养记录
    int CarSellNum();//累计卖车数
    int AllCae();//车辆总数

    BigDecimal sales();


}

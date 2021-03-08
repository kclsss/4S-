package com.peng.carfours.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public  interface IndexMapper {
    String getpassword(String username);
}

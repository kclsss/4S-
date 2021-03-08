package com.peng.carfours.mapper;


import com.peng.carfours.pojo.Maintain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MaintenanceMapper {

    List<Maintain> AllMaintain();

    void addMaintain(Maintain maintain);

}

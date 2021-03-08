package com.peng.carfours.mapper;


import com.peng.carfours.pojo.Carmessage;
import com.peng.carfours.pojo.People;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarmessageMapper {

    List<Carmessage> AllCarmessqge();

    Carmessage queryById(int id);

    void addCarmessqge(Carmessage carmessage);

    void updateCarmessage(Carmessage carmessage);

    void deleteCarmessage(int id);

}

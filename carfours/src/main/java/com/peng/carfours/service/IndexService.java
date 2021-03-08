package com.peng.carfours.service;

import com.peng.carfours.mapper.IndexMapper;
import com.peng.carfours.pojo.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import sun.security.provider.MD5;

import java.util.HashMap;
import java.util.Map;

@Service
public class IndexService {

    @Autowired
    private IndexMapper indexMapper;

    public Map<String,String> index(Administrator administrator){
        HashMap<String, String> map = new HashMap<>();
        String msg = null;
        String pwdMD5 = DigestUtils.md5DigestAsHex(administrator.getPassword().getBytes());
        String pwd = indexMapper.getpassword(administrator.getUsername());
        if (pwd==null){
            msg = "无此用户";
            map.put("state","0");
            map.put("msg",msg);
            return map;
        }else if(pwdMD5.equals(pwd)){
            map.put("state","1");
            return map;
        }else {
            msg = "密码错误";
            map.put("state","0");
            map.put("msg",msg);
            return map;
        }
    }
}

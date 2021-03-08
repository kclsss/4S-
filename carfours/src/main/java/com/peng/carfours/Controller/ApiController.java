package com.peng.carfours.Controller;

import com.peng.carfours.pojo.SellCar;
import com.peng.carfours.service.ApiService;
import com.peng.carfours.service.CarmessageService;
import com.peng.carfours.service.CustomerService;
import com.peng.carfours.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private SellService sellService;

    @Autowired
    private ApiService apiService;


    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/CusNumber")
    public Map count(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("number",customerService.count());
        return map;
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/SellCar")
    public List sellPage(){
        List<SellCar> sellCars = sellService.AllSellcar();
        return sellCars;
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/CarSell")
    public Map CarSell(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("data",apiService.CarSell());
        return map;
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/CarMaintain")
    public Map CarMaintain(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("data",apiService.CarMaintain());
        return map;
    }

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/CarSellNum")
    public Map CarSellNum(){
        HashMap<String, Object> map = new HashMap<>();
        Map map1 = new HashMap();
        map1.put("AllCar",apiService.AllCar());
        map1.put("SellCar",apiService.CarSellNum());
        ArrayList<Map> objects = new ArrayList<>();
        objects.add(map1);
        map.put("data",objects);
        return map;
    }


    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/Sales")
    public Map CarSales(){
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("sales",apiService.Sales());
        map.put("data",map1);
        return map;
    }






}

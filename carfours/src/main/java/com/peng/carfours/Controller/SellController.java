package com.peng.carfours.Controller;

import com.peng.carfours.mapper.SellMapper;
import com.peng.carfours.pojo.SellCar;
import com.peng.carfours.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SellController {

    @Autowired
    private SellService sellService;

    @RequestMapping("/sell")
    public String sellPage(Model model){
        List<SellCar> sellCars = sellService.AllSellcar();
        model.addAttribute("sellCars",sellCars);
        return "sell/sell";
    }

}

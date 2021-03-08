package com.peng.carfours.Controller;

import com.peng.carfours.mapper.NotSellMapper;
import com.peng.carfours.pojo.Carmessage;
import com.peng.carfours.pojo.People;
import com.peng.carfours.pojo.SellCar;
import com.peng.carfours.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NotSellController {

    @Autowired
    private NotSellService notSellService;

    @Autowired
    private CarmessageService carmessageService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private SalemanService salemanService;

    @RequestMapping("/notsell")
    public String notsellPage(Model model){

        List<Carmessage> carmessages = notSellService.notSellcar();

        model.addAttribute("carmessages",carmessages);
        return "notSell/notSell";
    }



    @GetMapping("/buycar/{id}")
    public String signinBuy(@PathVariable("id") int id, Model model){

        Carmessage carmessage = carmessageService.queryById(id);

        model.addAttribute("carmessage",carmessage);

        List<People> allCustomer = customerService.allCustomer();

        model.addAttribute("allCustomer",allCustomer);

        List<People> allSeller = salemanService.allSeller();

        model.addAttribute("allSeller",allSeller);


        return "notSell/buyCar";
    }

    @PostMapping("/buycar")
    public String buycar(Carmessage carmessage,Model model){

        notSellService.sellcar(carmessage);

        return "redirect:/notsell";
    }




}

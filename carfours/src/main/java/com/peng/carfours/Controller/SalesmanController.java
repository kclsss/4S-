package com.peng.carfours.Controller;

import com.peng.carfours.pojo.People;
import com.peng.carfours.service.SalemanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SalesmanController {

    @Autowired
    private SalemanService salemanService;



    @RequestMapping("/salepage")
    public String allSeller(Model model){
        List<People> people = salemanService.allSeller();
        model.addAttribute("sellers",people);
        return "saleman/salesmanPage";
    }
/*    @RequestMapping("/salepage")
    @ResponseBody
    public List allSeller(){
        List<People> people = salemanService.allSeller();
        return people;
    }*/

    @GetMapping("/addSaleman")
    public String signin(){
        return "saleman/addSaleman";
    }

    @PostMapping("/addSaleman")
    public String addSaleman(People people,Model model){
        model.addAttribute("msg","添加成功");
        salemanService.addSaleman(people);
        return "redirect:/salepage";
    }

    @GetMapping("/updatesale/{id}")
    public String signinUpdate(@PathVariable("id") int id,Model model){
        People people = salemanService.queryById(id);
        System.out.println(people);
        model.addAttribute("seller",people);
        return "saleman/updateSaleman";
    }

    @PostMapping("/updatesale")
    public String updateSaleman(People people,Model model){
        salemanService.updateSaleman(people);
        System.out.println(people);
        model.addAttribute("msg","修改成功");
        return "redirect:/salepage";
    }

    @GetMapping("/deletesale/{id}")
    public String deleteSaleman(@PathVariable("id") int id,Model model){
        salemanService.deleteSaleman(id);
        model.addAttribute("msg","删除成功");
        return "redirect:/salepage";
    }

}

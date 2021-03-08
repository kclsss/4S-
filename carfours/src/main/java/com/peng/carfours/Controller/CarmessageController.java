package com.peng.carfours.Controller;

import com.peng.carfours.pojo.Carmessage;
import com.peng.carfours.service.CarmessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CarmessageController {

    @Autowired
    private CarmessageService carmessageService;



    @RequestMapping("/allcar")
    public String customerPage(Model model){
        List<Carmessage> carmessages = carmessageService.allCarmessage();
        model.addAttribute("carmessages",carmessages);
        return "carmessage/carmessqgePage";
    }

    @GetMapping("/addCarmessage")
    public String signin(){
        return "carmessage/addCarmessage";
    }

    @PostMapping("/addCarmessage")
    public String addCarmessage(Carmessage carmessage,Model model){
        carmessageService.addCarmessage(carmessage);
        model.addAttribute("msg","添加成功");
        return "redirect:/allcar";
    }

    @GetMapping("/updateCarmessage/{id}")
    public String update(@PathVariable("id") int id,Model model){
        Carmessage carmessage = carmessageService.queryById(id);
        model.addAttribute("carmessage",carmessage);
        return "carmessage/updateCarmessage";
    }

    @PostMapping("/updateCarmessage")
    public String updateCarmessage(Carmessage carmessage,Model model){
        carmessageService.updateCarmessage(carmessage);
        model.addAttribute("msg","修改成功");
        return  "redirect:/allcar";
    }


    @GetMapping("/deleteCarmessage/{id}")
    public String deleteCarmessage(@PathVariable("id") int id,Model model){
        carmessageService.deleteCarmessage(id);
        model.addAttribute("msg","删除成功");
        return  "redirect:/allcar";
    }

}

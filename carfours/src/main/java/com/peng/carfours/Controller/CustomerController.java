package com.peng.carfours.Controller;

import com.peng.carfours.pojo.People;
import com.peng.carfours.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer")
    public String customerPage(Model model){
        List<People> people = customerService.allCustomer();
        model.addAttribute("customers",people);
        return "customer/customerPage";
    }

/*    @RequestMapping("/customer")
    @ResponseBody
    public List customerPage(HttpServletRequest request){
        List<People> people = customerService.allCustomer();
        return people;
    }*/


    @GetMapping("/addCustomer")
    public String signin(){
        return "customer/addCustomer";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(People people,Model model){
        model.addAttribute("msg","添加成功");
        System.out.println(people);
        customerService.addCustomer(people);
        return "redirect:/customer";
    }

    @GetMapping("/updatecustomer/{id}")
    public String signinUpdate(@PathVariable("id") int id, Model model){
        People people = customerService.queryById(id);
        model.addAttribute("customer",people);
        return "customer/updateCustomer";
    }

    @PostMapping("/updatecustomer")
    public String updateSaleman(People people,Model model){
        customerService.updateCustomer(people);
        model.addAttribute("msg","修改成功");
        return "redirect:/customer";
    }

    @GetMapping("/deletecustomer/{id}")
    public String deleteSaleman(@PathVariable("id") int id,Model model){
        customerService.deleteCustomer(id);
        model.addAttribute("msg","删除成功");
        return "redirect:/customer";
    }


}

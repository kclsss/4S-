package com.peng.carfours.Controller;

import com.peng.carfours.pojo.Maintain;
import com.peng.carfours.pojo.People;
import com.peng.carfours.service.CustomerService;
import com.peng.carfours.service.MaintenanceService;
import com.peng.carfours.service.SalemanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MaintenanceeController {

    @Autowired
    private MaintenanceService maintenanceService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private SalemanService salemanService;

    @RequestMapping("/maintenance")
    public String sellPage(Model model){
        List<Maintain> maintenances = maintenanceService.AllSellcar();
        model.addAttribute("maintenances",maintenances);
        return "maintenance/maintenancePage";
    }

    @RequestMapping("/addMain")
    public String addMain(Model model){

        List<People> allCustomer = customerService.allCustomer();

        model.addAttribute("allCustomer",allCustomer);

        return "maintenance/addMaintenance";
    }

    @RequestMapping("/addMaintenance")
    public String addMaintence(Maintain maintain){

        maintenanceService.addMaintance(maintain);

        System.out.println(maintain);

        return "redirect:/maintenance";
    }




}

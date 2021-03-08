package com.peng.carfours.Controller;

import com.peng.carfours.mapper.ResultMapper;
import com.peng.carfours.pojo.Administrator;
import com.peng.carfours.service.ApiService;
import com.peng.carfours.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private ResultMapper resultMapper;

    @Autowired
    private ApiService apiService;

    @RequestMapping({"/","/index.html"})
    public String indexpage(){
        return "index";
    }

    @RequestMapping("/main.html")
    public String login(){
        return "system";
    }

    @RequestMapping("/login")
    public String index(Administrator administrator, Model model, HttpSession session){

        Map<String, String> index = indexService.index(administrator);

        if("0".equals(index.get("state"))){
            model.addAttribute("msg",index.get("msg"));
            return "index";
        }else {
            session.setAttribute("username",administrator.getUsername());
            return "redirect:main.html";
        }

    }

    @RequestMapping("/loginout")
    public String loginout(HttpSession session){
        session.invalidate();
        return "redirect:index.html";

    }

    @RequestMapping("/result")
    public String result(Model model){
        List list = resultMapper.allResult();
        model.addAttribute("results",list);
        return "results/Results";
    }

    @RequestMapping("/sales")
    public String sales(Model model){
        List list = apiService.CarSell();
        model.addAttribute("sales",list);
        return "results/Sales";
    }

}

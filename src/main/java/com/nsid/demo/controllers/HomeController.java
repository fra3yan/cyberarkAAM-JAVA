package com.nsid.demo.controllers;

import com.nsid.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import com.nsid.demo.controllers.PSDKController;

@Controller
@RequestMapping("")



public class HomeController {


    //
    static void myMethod() {
        // code to be executed
    }

    @Autowired
    private com.nsid.demo.repository.CityRepository CityRepository;

    @GetMapping(value = "/")
    public String home(Model model){
        String messages = "Password SDK Demo";
        model.addAttribute("msg",messages);
        return "index";
    }

    @GetMapping(value = "/normal")
    public String normal(Model model){
        String messages = "";
        model.addAttribute("cities",CityRepository.findAll());
        model.addAttribute("msg",messages);
        return "table";
    }

    @Autowired
    public Environment env;
    @GetMapping(value = "/psdk")
    public String psdk(Model model){

        String getPSDK;
        getPSDK =  PSDKController.getPSDK(env);

        String messages = "secure content from cyberark api is "+getPSDK;
        model.addAttribute("msg",messages);
        return "index";
    }


}

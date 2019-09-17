package com.shellys_capstone.shellyscapstone.controllers;

import com.shellys_capstone.shellyscapstone.models.data.TripDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class TripController {


    @Controller
    @RequestMapping ("trip")


    @RequestMapping(value = "")
        public String index(Model model) {

           // model.addAttribute("trip", TripDao.findAll());
            model.addAttribute("title", "Let's Split It");

            return "trip/index";
        }
    }







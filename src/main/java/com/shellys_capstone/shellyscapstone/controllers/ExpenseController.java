package com.shellys_capstone.shellyscapstone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("expense")
public class ExpenseController {

    @RequestMapping(value = "")
    public String index(Model model) {

        //model.addAttribute("expense", expenseDao.findAll());
        model.addAttribute("title", "Let's Split It");

        return "expense/index";
    }

}
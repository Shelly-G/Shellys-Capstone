package com.shellys_capstone.shellyscapstone.controllers;


import com.shellys_capstone.shellyscapstone.models.forms.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;



@SuppressWarnings("deprecation")
@Controller
@RequestMapping("user")

public class UserController {

    @SuppressWarnings("deprecation")
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute(new User());
        model.addAttribute("title", "Register");
        return "user/add";
}
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute @Valid User user, Errors errors) {

        model.addAttribute(user);

        if(!errors.hasErrors()){
            return "user/index";
        }

        return "user/add";
    }

}


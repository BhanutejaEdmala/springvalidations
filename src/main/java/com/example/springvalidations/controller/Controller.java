package com.example.springvalidations.controller;

import com.example.springvalidations.entities.User;
import com.example.springvalidations.validations.AllValid;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    AllValid allValid;
    @RequestMapping("/input")
    public String input(ModelMap m){
        m.put("user",new User());
        return "input";
    }
    @RequestMapping("/process")
    public String process(@Valid  @ModelAttribute User user , BindingResult bindingResult, ModelMap m){
       // allValid.validate(user,bindingResult);
        System.out.println(bindingResult.hasErrors());
     if(bindingResult.hasErrors())
         return "input";
     else {
         System.out.println(user);
         return null;
     }
    }
}

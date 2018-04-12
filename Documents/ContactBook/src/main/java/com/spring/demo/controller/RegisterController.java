package com.spring.demo.controller;

import com.spring.demo.entity.User;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.ManyToOne;
import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView loginPage(){
        ModelAndView modelAndView=new ModelAndView( "home" );
        return modelAndView;
    }

    @RequestMapping(value = "/registerationDone",method = RequestMethod.POST)
    ModelAndView register(User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView=new ModelAndView( "home" );
            return modelAndView;
        }
        userService.saveUsers( user);
        ModelAndView modelAndView=new ModelAndView(  "home");
        return modelAndView;
    }
}

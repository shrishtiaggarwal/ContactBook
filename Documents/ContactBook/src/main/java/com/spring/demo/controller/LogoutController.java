package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logoutUser(HttpSession session, Model model)
    {
        session.setAttribute( "userlogedin",false );
        model.addAttribute( "logoutmsg","You Are Successfully Logout" );
        session.invalidate();
        return "home";

    }
}

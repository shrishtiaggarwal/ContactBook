package com.spring.demo.controller;

import com.spring.demo.entity.Contact;
import com.spring.demo.entity.User;
import com.spring.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping(value = "/searchContact",method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> contactSearch(@RequestParam("freeText") String freeText, HttpSession session)
    {
        User user = (User) session.getAttribute("userobj");

        return searchService.findUserContact(user, freeText);
    }
}

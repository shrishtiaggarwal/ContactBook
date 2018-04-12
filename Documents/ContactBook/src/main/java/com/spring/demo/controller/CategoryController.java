package com.spring.demo.controller;

import com.spring.demo.entity.Category;
import com.spring.demo.entity.User;
import com.spring.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/addCategory",method = RequestMethod.POST)
    @ResponseBody
    String addCategory(@Valid Category category, HttpSession session){
        User user1=(User)session.getAttribute( "userobj" );
        category.setCreatedBy( user1 );
        return categoryService.addCategory( category );

    }
}

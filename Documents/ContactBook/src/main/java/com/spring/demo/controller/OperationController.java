package com.spring.demo.controller;

import com.spring.demo.entity.Category;
import com.spring.demo.entity.Contact;
import com.spring.demo.entity.User;
import com.spring.demo.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OperationController {

    @Autowired
    OperationService operationService;

    @RequestMapping(value = "/deleteContact",method = RequestMethod.POST)
    @ResponseBody
    String deleteContact(@RequestParam("contactId") int id){
        operationService.deleteContact(id);
        System.out.println("ajax call");
        return "data deleted!";
    }

    @RequestMapping(value = "/contactInfo",method = RequestMethod.POST)
    @ResponseBody
    Contact contactInfoToUpdate(@RequestParam("contactId") int id){
       Contact contact= operationService.retreiveContact( id );
        System.out.println("contact:"+contact);
        return contact;
    }

    @RequestMapping(value = "/updateContact",method = RequestMethod.POST)
    @ResponseBody
    Contact updateContact(@ModelAttribute Contact contact, @RequestParam("contactId") int id){
        System.out.println("--------------------------------------------");
        System.out.println("Contact id from domain" + contact.getContactId());
        System.out.println("Param id: " + id);
        System.out.println("--------------------------------------------");
        operationService.updateContact( contact);
        return contact;
    }

    @RequestMapping(value = "/deleteCategory",method = RequestMethod.POST)
    @ResponseBody
    String deleteCategory(@RequestParam("categoryId") int id){
        operationService.deleteCategory(id);
        return "category Deleted!";
    }
}

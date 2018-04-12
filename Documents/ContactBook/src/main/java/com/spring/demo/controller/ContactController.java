package com.spring.demo.controller;

import com.spring.demo.entity.Category;
import com.spring.demo.entity.Contact;
import com.spring.demo.entity.User;
import com.spring.demo.service.CategoryService;
import com.spring.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/addContact",method = RequestMethod.POST)
    @ResponseBody
    String addContact(@ModelAttribute Contact contact, HttpSession session, BindingResult bindingResult,
                      @RequestParam("categoryid") String category){
        User user1=(User)session.getAttribute( "userobj" );
        contact.setCreatedBy( user1 );
        String arr[]=category.split( "," );
        List<Category> list=new ArrayList<>(  );
       for (int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
           int categoryId=Integer.parseInt(arr[i]);
           Category category1= categoryService.getCategoryById( categoryId );
           list.add( category1 );
       }
          contact.setCategory( list );
          if(bindingResult.hasErrors()){
              System.out.println(bindingResult.getAllErrors().toString());
        }
          return contactService.addContact(contact);
    }


    @RequestMapping(value = "/getContactList",method = RequestMethod.GET)
    @ResponseBody
    public  List<Contact> getAllContacts(HttpSession session,@RequestParam("pageNumber") String pagenumber)
    {
        int pageNumber=Integer.parseInt(pagenumber);
        User user= (User) session.getAttribute("userobj");

        return contactService.getAllContacts(user,pageNumber);
    }
}

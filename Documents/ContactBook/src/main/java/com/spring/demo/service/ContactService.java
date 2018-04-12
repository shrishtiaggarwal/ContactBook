package com.spring.demo.service;

import com.spring.demo.entity.Category;
import com.spring.demo.entity.Contact;
import com.spring.demo.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

  @Autowired
  LocalSessionFactoryBean sessionFactoryBean;

    public String addContact(Contact contact){

        SessionFactory sessionFactory = sessionFactoryBean.getObject();
        Session session=sessionFactory.openSession();
        session.save( contact);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return "Contact is added!";

    }


    public List<Contact> getAllContacts(User user,int pagenumber) {

        SessionFactory sessionFactory = sessionFactoryBean.getObject();
        Session session = sessionFactory.openSession();
            //language=HQL
            Query query = session.createQuery( "from Contact where createdBy.userId=:uid" );
            query.setParameter( "uid", user.getUserId() );
            return query.list();

    }
}

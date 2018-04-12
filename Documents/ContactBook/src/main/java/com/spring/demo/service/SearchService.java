package com.spring.demo.service;

import com.spring.demo.entity.Contact;
import com.spring.demo.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchService {

    @Autowired
    LocalSessionFactoryBean sessionFactoryBean;


    public List<Contact> findUserContact(User user, String text) {
        SessionFactory sessionFactory = sessionFactoryBean.getObject();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

            int userId = user.getUserId();
            //language=HQL
            org.hibernate.Query query = session.createQuery( "from Contact where (contactName like '%" + text + "%' and createdBy.userId=:uid)" );
            query.setParameter( "uid", userId );

            return query.list();


    }

}

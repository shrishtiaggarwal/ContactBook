package com.spring.demo.service;

import com.spring.demo.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    LocalSessionFactoryBean sessionFactoryBean;

    public void saveUsers(User user){

        SessionFactory sessionFactory = sessionFactoryBean.getObject();
        Session session=sessionFactory.openSession();
        session.save( user );
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();


    }

    public User validateUser(String userName,String password){
        SessionFactory sessionFactory =sessionFactoryBean.getObject();
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from User where userName=:userName and password=:password");
        query.setParameter( "userName",userName );
        query.setParameter( "password",password );
        User user=(User) query.uniqueResult();
        System.out.println(user);
        session.close();
        return user;

    }

}

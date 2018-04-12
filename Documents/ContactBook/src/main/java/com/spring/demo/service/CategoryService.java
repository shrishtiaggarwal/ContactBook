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
public class CategoryService {

    @Autowired
    LocalSessionFactoryBean sessionFactoryBean;


    public String addCategory(Category category){

        SessionFactory sessionFactory = sessionFactoryBean.getObject();
        Session session=sessionFactory.openSession();
        session.save( category);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        return "Category is added!";

    }

    public List<Category> getCategory(User user) {
        SessionFactory sessionFactory = sessionFactoryBean.getObject();
        Session session = sessionFactory.openSession();
        //language=HQL
        Query query = session.createQuery( "from Category where createdBy.userId=:userId" );
        query.setParameter( "userId", user.getUserId() );
        return query.list();
    }

    public Category getCategoryById(int catid)
    {
        SessionFactory sessionFactory = sessionFactoryBean.getObject();
        Session session = sessionFactory.openSession();
        //language=HQL
        Query query = session.createQuery( "from Category where categoryId=:cid" );
        query.setParameter( "cid", catid );
        return (Category) query.uniqueResult();
    }


}

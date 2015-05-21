package com.osf.romanvintonyak.WSDummy.dao;

import com.osf.romanvintonyak.WSDummy.Entities.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 * Created by Roman on 21.05.2015.
 */

public class UserDao {

    public User findById(long id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyPU");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        System.out.println(user);
        em.getTransaction().commit();
        em.close();

        return user;
    }
}

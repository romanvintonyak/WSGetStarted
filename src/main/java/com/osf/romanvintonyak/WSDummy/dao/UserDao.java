package com.osf.romanvintonyak.WSDummy.dao;

import com.osf.romanvintonyak.WSDummy.entities.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by Roman on 21.05.2015.
 */
@Stateless
public class UserDao {

    @PersistenceContext
    private EntityManager em;

    public boolean checkUser(User user) {
        Query query = em.createQuery("SELECT u FROM User u WHERE u.username = :username and u.password = :password");
        query.setParameter("username", user.getUsername());
        query.setParameter("password", user.getPassword());
        return query.getResultList().size() > 0;
    }
}

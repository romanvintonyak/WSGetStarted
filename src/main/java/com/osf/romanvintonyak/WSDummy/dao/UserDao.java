package com.osf.romanvintonyak.WSDummy.dao;

import com.osf.romanvintonyak.WSDummy.Entities.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Roman on 21.05.2015.
 */
@Stateless
public class UserDao {
    @PersistenceContext(unitName="primary")
    private EntityManager em;

    public User findById(long id) {
        System.out.println(em);
        return em.find(User.class, id);
    }
}

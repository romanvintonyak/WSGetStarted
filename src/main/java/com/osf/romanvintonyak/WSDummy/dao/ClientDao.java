package com.osf.romanvintonyak.WSDummy.dao;

import com.osf.romanvintonyak.WSDummy.entities.Client;
import com.osf.romanvintonyak.WSDummy.entities.Test;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

/**
 * Created by Roman on 22.05.2015.
 */
@Stateless
public class ClientDao {

    @PersistenceContext
    private EntityManager em;

    public Client getById(long id) {
        return em.find(Client.class, id);
    }

    public void fillTestData() {
        Test test1 = new Test("first demo test");
        Test test2 = new Test("second demo test");
        Test test3 = new Test("third demo test");
        Test test4 = new Test("fourth demo test");
        Test test5 = new Test("fifth demo test");
        Test test6 = new Test("sixth demo test");
        Test test7 = new Test("seventh demo test");
        Test test8 = new Test("eighth demo test");
        Test test9 = new Test("ninth demo test");

        Set<Test> client1List = new HashSet<>();
        client1List.add(test1);
        client1List.add(test2);
        client1List.add(test3);

        Set<Test> client2List = new HashSet<>();
        client2List.add(test4);
        client2List.add(test5);
        client2List.add(test6);

        Set<Test> client3List = new HashSet<>();
        client3List.add(test7);
        client3List.add(test8);
        client3List.add(test9);


        Client client1 = new Client(20148, client1List);
        Client client2 = new Client(21148, client2List);
        Client client3 = new Client(22148, client3List);

        test1.setClient(client1);
        test2.setClient(client1);
        test3.setClient(client1);
        test4.setClient(client2);
        test5.setClient(client2);
        test6.setClient(client2);
        test7.setClient(client3);
        test8.setClient(client3);
        test9.setClient(client3);


        em.persist(client1);
        em.persist(client2);
        em.persist(client3);
        em.flush();
    }
}

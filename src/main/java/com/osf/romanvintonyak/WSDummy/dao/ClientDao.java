package com.osf.romanvintonyak.WSDummy.dao;

import com.osf.romanvintonyak.WSDummy.Entities.Client;
import com.osf.romanvintonyak.WSDummy.Entities.Test;
import com.osf.romanvintonyak.WSDummy.Services.Base64Encoder;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.*;

import static java.util.Arrays.*;

/**
 * Created by Roman on 22.05.2015.
 */
@Stateless
public class ClientDao {
    @PersistenceContext(name = "datasource")
    private EntityManager em;

    @EJB
    private Base64Encoder encoder;

    public void saveClient(Client client) {
        em.persist(client);
        em.flush();

    }

    public void fillTestData() {
        Test test1 = new Test("first demo test");
       /* Test test2 = new Test("second demo test");
        Test test3 = new Test("third demo test");
*/
        List<Test> tests = new ArrayList<>();
        tests.add(test1);
        //tests.add(test2);
        Set<Test> testSet = new HashSet<>(tests);

        Client client1 = new Client(20148,testSet);
        Client client2 = new Client(21148,testSet);
        Client client3 = new Client(22148,testSet);

        saveClient(client1);
        /*saveClient(client2);
        saveClient(client3);*/
    }
}

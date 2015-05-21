package com.osf.romanvintonyak.WSDummy.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roman on 21.05.2015.
 */
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(mappedBy = "client")
    private Set<Test> tests = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }
}

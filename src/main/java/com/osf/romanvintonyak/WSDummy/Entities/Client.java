package com.osf.romanvintonyak.WSDummy.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Roman on 21.05.2015.
 */
@Entity
@Table
public class Client {
    @Id
    private long id;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Test> tests;

    public Client() {
    }

    public Client(long id, Set<Test> tests) {
        this.id = id;
        this.tests = tests;
    }

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

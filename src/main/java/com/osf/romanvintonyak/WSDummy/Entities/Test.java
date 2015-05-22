package com.osf.romanvintonyak.WSDummy.Entities;

import com.osf.romanvintonyak.WSDummy.Services.Base64Encoder;

import javax.ejb.EJB;
import javax.persistence.*;

/**
 * Created by Roman on 21.05.2015.
 */
@Entity
@Table
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //ex.="first demo test";unique
    private String name;

    //base64(id)
    private String displayName;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    @PostPersist
    void generate(){
        displayName = Base64Encoder.encodeToBase64(getId());
    }
    public Test() {}

    public Test(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

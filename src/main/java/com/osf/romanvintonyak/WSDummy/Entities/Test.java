package com.osf.romanvintonyak.WSDummy.entities;

import com.osf.romanvintonyak.WSDummy.services.Base64Encoder;

import javax.persistence.*;

@Entity
@Table
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //should be unique ex."first demo test"
    private String name;

    //should be like base64(id)
    private String displayName;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }

    /**
     * Assigns base64 value to displayName based on id
     */
    @PostPersist
    void generate() {
        displayName = Base64Encoder.encodeToBase64(getId());
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

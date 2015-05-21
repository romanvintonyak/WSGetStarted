package com.osf.romanvintonyak.WSDummy.Entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 * Created by Roman on 21.05.2015.
 */
public class Test {
    private long id;
    private String name;
    private String displayName;
    @ManyToMany
    @JoinColumn(name = "client_id")
    private Client client = new Client();

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

package com.titan.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
@Entity
public class Ship implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(cascade={CascadeType.ALL})
    private Collection<Cabin> cabins = new ArrayList<Cabin>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Cabin> getCabins() {
        return cabins;
    }

    public void setCabins(Collection<Cabin> cabins) {
        this.cabins = cabins;
    }
}

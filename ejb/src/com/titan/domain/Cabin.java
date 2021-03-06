package com.titan.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Cabin implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int deckLevel;
    @ManyToOne
    private Ship ship;


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

    public int getDeckLevel() {
        return deckLevel;
    }

    public void setDeckLevel(int deckLevel) {
        this.deckLevel = deckLevel;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}

package com.titan.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String lastName;
    private String firstName;
    private boolean hasGoodCredit;
    @OneToMany(cascade={CascadeType.ALL})
    private Collection<Phone> phoneNumbers = new ArrayList<Phone>();
    @OneToOne(cascade={CascadeType.ALL})
    private CreditCard creditCard;
    @OneToOne(cascade={CascadeType.ALL})
    private Address address;
    @ManyToMany
    private Collection<Reservation> reservations = new ArrayList<Reservation>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isHasGoodCredit() {
        return hasGoodCredit;
    }

    public void setHasGoodCredit(boolean hasGoodCredit) {
        this.hasGoodCredit = hasGoodCredit;
    }

    public Collection<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Collection<Phone> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }
}

package com.ticketing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PassengerDetails {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;

}

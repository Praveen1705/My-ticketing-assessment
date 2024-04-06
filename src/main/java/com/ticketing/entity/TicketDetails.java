package com.ticketing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TicketDetails {

    @Id
    @GeneratedValue
    private Long id;
    private String From;
    private String to;
    private PassengerDetails passengerDetails;
    private Double fare;
    @ManyToOne
    private PassengerDetails passDetails;
}

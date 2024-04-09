package com.ticketing.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "passenger_details")
public class PassengerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="first_name")
    private String firstName;
    @Column(name ="last_name")
    private String lastName;
    @Column(name ="email_address")
    private String emailAddress;

}

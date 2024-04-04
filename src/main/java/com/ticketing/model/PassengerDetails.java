package com.ticketing.model;

import lombok.Data;

@Data
public class PassengerDetails {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String streetDetails;
    private String city;
    private String State;
    private String pinCode;
}

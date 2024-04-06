package com.ticketing.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TicketDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String From;
    private String to;
    private Long passengerId;
    private Double fare;
    private String seatSection;
    private Integer seatNumber;
    @OneToOne
    @JoinColumn(name ="passenger_id", referencedColumnName = "id")
    private PassengerDetails passDetails;
}

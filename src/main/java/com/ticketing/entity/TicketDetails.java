package com.ticketing.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket_details")
public class TicketDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="from")
    private String From;
    @Column(name ="to")
    private String to;
    @Column(name ="passenger_id")
    private Long passengerId;
    @Column(name ="ticket_rate")
    private Double fare;
    @Column(name ="seat_section")
    private String seatSection;
    @Column(name ="seat_number")
    private Integer seatNumber;
    @OneToOne
    @JoinColumn(name ="passenger_id", referencedColumnName = "id")
    private PassengerDetails passDetails;
}

package com.ticketing.model;

import lombok.Data;

@Data
public class TicketDetails {

    private String From;
    private String to;
    private PassengerDetails passengerDetails;
    private Double fare;
    private SeatAllocationDetails seatDetails;
}

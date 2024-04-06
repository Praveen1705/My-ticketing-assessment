package com.ticketing.Dto;

import lombok.Data;

@Data
public class ReceiptInfoDto {

    private Long passengerId;
    private String from;
    private String to;
    private String ticketFare;
    private PassengerDto passengerInfo;
    private SeatDto seatDetails;

}

package com.ticketing.Dto;

import lombok.Data;

@Data
public class BookTicketDto {

    private Long passengerId;
    private String from;
    private String to;
    private String ticketFare;
    private String seatSection;
    private Integer seatNumber;


}

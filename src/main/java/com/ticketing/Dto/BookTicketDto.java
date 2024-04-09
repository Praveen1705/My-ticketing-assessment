package com.ticketing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookTicketDto {

    private Long passengerId;
    private String from;
    private String to;
    private String ticketFare;
    private String seatSection;
    private Integer seatNumber;


}

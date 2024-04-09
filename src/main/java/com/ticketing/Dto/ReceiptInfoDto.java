package com.ticketing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptInfoDto {

    private Long passengerId;
    private String from;
    private String to;
    private String ticketFare;
    private PassengerDto passengerInfo;
    private String seatSection;
    private Integer seatNumber;
    private String errorMessage;

    public ReceiptInfoDto(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}

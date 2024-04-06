package com.ticketing.Dto;

import lombok.Data;

@Data
public class UpdateSeatRequest {

    private String section;
    private Integer seatNumber;
}

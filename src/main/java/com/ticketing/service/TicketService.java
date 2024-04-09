package com.ticketing.service;

import com.ticketing.dto.BookTicketDto;
import com.ticketing.dto.PassengerDto;
import com.ticketing.dto.ReceiptInfoDto;
import com.ticketing.dto.UpdateSeatRequest;


public interface TicketService {

    void buyTicket(BookTicketDto ticInfo);

    ReceiptInfoDto getTicketInfo(Long ticketId);

    void cancelTicket(Long id) throws Exception;

    void changeSeat(Long id, UpdateSeatRequest seatChange) throws Exception;

    void userRegister(PassengerDto passengerDto);
}

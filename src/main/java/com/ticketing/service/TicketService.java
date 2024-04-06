package com.ticketing.service;

import com.ticketing.Dto.BookTicketDto;
import com.ticketing.Dto.PassengerDto;
import com.ticketing.Dto.ReceiptInfoDto;
import com.ticketing.Dto.UpdateSeatRequest;


public interface TicketService {

    void buyTicket(BookTicketDto ticInfo);

    ReceiptInfoDto getTicketInfo(Long ticketId);

    void cancelTicket(Long id);

    void changeSeat(Long id, UpdateSeatRequest seatChange) throws Exception;

    void userRegister(PassengerDto passengerDto);
}

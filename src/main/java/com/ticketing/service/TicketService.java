package com.ticketing.service;

import com.ticketing.Dto.BookTicketDto;
import com.ticketing.Dto.PassengerDto;



public interface TicketService {

    void buyTicket(BookTicketDto ticInfo);

    PassengerDto getTicketInfo(Long ticketDto);

    void cancelTicket(Long id);

    void userRegister(PassengerDto passengerDto);
}

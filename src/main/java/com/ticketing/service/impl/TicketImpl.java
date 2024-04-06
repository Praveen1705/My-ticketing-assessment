package com.ticketing.service.impl;

import com.ticketing.Dto.BookTicketDto;
import com.ticketing.Dto.PassengerDto;
import com.ticketing.entity.PassengerDetails;
import com.ticketing.entity.TicketDetails;
import com.ticketing.repository.PassengerRepo;
import com.ticketing.repository.TicketRepo;
import com.ticketing.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TicketImpl implements TicketService {

 @Autowired
 private PassengerRepo passengerRepo;

    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void buyTicket(BookTicketDto ticInfo) {

        TicketDetails ticketDetails = modelMapper.map(ticInfo,TicketDetails.class );
        ticketRepo.save(ticketDetails);
    }

    @Override
    public PassengerDto getTicketInfo(Long ticketDto) {
        return null;
    }

    @Override
    public void cancelTicket(Long id) {

    }

    @Override
    public void userRegister(PassengerDto passengerDto) {


    }
}

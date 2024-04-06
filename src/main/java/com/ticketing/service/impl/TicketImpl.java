package com.ticketing.service.impl;

import com.ticketing.Dto.BookTicketDto;
import com.ticketing.Dto.PassengerDto;
import com.ticketing.Dto.ReceiptInfoDto;
import com.ticketing.Dto.UpdateSeatRequest;
import com.ticketing.entity.PassengerDetails;
import com.ticketing.entity.TicketDetails;
import com.ticketing.repository.PassengerRepo;
import com.ticketing.repository.TicketRepo;
import com.ticketing.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TicketImpl implements TicketService {

     @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private PassengerRepo passengerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void userRegister(PassengerDto passengerDto) {

        PassengerDetails passengerDetails = modelMapper.map(passengerDto,PassengerDetails.class );
        passengerRepo.save(passengerDetails);
    }
    @Override
    public void buyTicket(BookTicketDto ticInfo) {

        TicketDetails ticketDetails = modelMapper.map(ticInfo,TicketDetails.class );
        ticketRepo.save(ticketDetails);
    }

    @Override
    public ReceiptInfoDto getTicketInfo(Long ticketId) {
        Optional<TicketDetails> ticketInfo = ticketRepo.findById(ticketId);
        return null;

    }

    @Override
    public void cancelTicket(Long id) {

    }

    @Override
    public void changeSeat(Long id, UpdateSeatRequest seatChange) throws Exception {
        Optional<TicketDetails> ticketInfo = ticketRepo.findById(id);

    }


}

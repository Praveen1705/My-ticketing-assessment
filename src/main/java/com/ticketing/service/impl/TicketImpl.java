package com.ticketing.service.impl;

import com.ticketing.Exception.TicketNotFoundException;
import com.ticketing.dto.BookTicketDto;
import com.ticketing.dto.PassengerDto;
import com.ticketing.dto.ReceiptInfoDto;
import com.ticketing.dto.UpdateSeatRequest;
import com.ticketing.entity.PassengerDetails;
import com.ticketing.entity.TicketDetails;
import com.ticketing.repository.PassengerRepo;
import com.ticketing.repository.TicketRepo;
import com.ticketing.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
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
        Optional<TicketDetails> ticketDetails = ticketRepo.findById(ticketId);

        if (ticketDetails.isPresent()) {
            TicketDetails ticket = ticketDetails.get();
            ReceiptInfoDto receiptInfoDto = modelMapper.map(ticket, ReceiptInfoDto.class);
            receiptInfoDto.setPassengerInfo(modelMapper.map(ticket.getPassDetails(), PassengerDto.class));
            return receiptInfoDto;
        } else {
            return new ReceiptInfoDto("Ticket not found with ID: " + ticketId);
        }
    }

    @Override
    public void cancelTicket(Long id) throws Exception{
        Optional<TicketDetails> ticket = ticketRepo.findById(id);
        if (ticket.isPresent()) {
            ticketRepo.delete(ticket.get());
        } else {
            throw new TicketNotFoundException("Ticket with ID " + id + " not found");
        }
    }
    @Override
    public void changeSeat(Long id, UpdateSeatRequest seatChange) throws Exception {
        Optional<TicketDetails> ticket = ticketRepo.findById(id);
        if (ticket.isPresent()) {
            ticket.get().setSeatSection(seatChange.getSection());
            ticket.get().setSeatNumber(seatChange.getSeatNumber());
            ticketRepo.save(ticket.get());

        } else {
            throw new TicketNotFoundException("Ticket with ID " + id + " not found");
        }
    }
}



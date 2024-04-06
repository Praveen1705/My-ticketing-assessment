package com.ticketing.controllers;

import com.ticketing.Dto.BookTicketDto;
import com.ticketing.Dto.PassengerDto;
import com.ticketing.Dto.ReceiptInfoDto;
import com.ticketing.Dto.UpdateSeatRequest;
import com.ticketing.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/train")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/userRegister")
    public ResponseEntity<String> userRegister (@RequestBody PassengerDto passengerDto){

        ticketService.userRegister(passengerDto);
        return ResponseEntity.ok("User Registered Successfully");
    }

    // endpoint for Buying ticket
    @PostMapping("/ticket")
    public ResponseEntity<String> buyTicket (@RequestBody BookTicketDto ticketDto){

       ticketService.buyTicket(ticketDto);
       return ResponseEntity.ok("Ticket booked Successfully");
   }

   // endpoint to view ticket details
    @GetMapping("/ticket/{id}")
    public ReceiptInfoDto getTicketInfo (@PathVariable Long id){

        return ticketService.getTicketInfo(id);

    }

    // endpoint to cancel/remove ticket
    @DeleteMapping("/ticket/{id}")
    public void cancelTicket(@PathVariable Long id)
    {
         ticketService.cancelTicket(id);
    }

    @PutMapping("/ticket/{id}/seat")
    public void changeSeat(@PathVariable Long id, @RequestBody UpdateSeatRequest seatChange) throws Exception {
                ticketService.changeSeat(id,seatChange);
    }


}


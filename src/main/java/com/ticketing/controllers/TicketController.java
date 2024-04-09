package com.ticketing.controllers;


import com.ticketing.dto.BookTicketDto;
import com.ticketing.dto.PassengerDto;
import com.ticketing.dto.ReceiptInfoDto;
import com.ticketing.dto.UpdateSeatRequest;
import com.ticketing.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/train")
public class TicketController {

    @Autowired
    TicketService ticketService;

    // endpoint to register user
    @PostMapping("/userregister")
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
   public ResponseEntity<ReceiptInfoDto> getTicketInfo(@PathVariable Long id) {
       ReceiptInfoDto receiptInfoDto = ticketService.getTicketInfo(id);
       return ResponseEntity.ok(receiptInfoDto);
   }

    // endpoint to cancel/remove ticket
    @DeleteMapping("/ticket/{id}")
    public ResponseEntity<Map<String, String>> cancelTicket(@PathVariable Long id) throws Exception {
        Map<String, String> response = new HashMap<>();
        ticketService.cancelTicket(id);
        response.put("message", "Ticket canceled successfully");
        return ResponseEntity.ok(response);
    }

    @PutMapping("/ticket/{id}/seat")
    public ResponseEntity<Map<String, String>> changeSeat(@PathVariable Long id, @RequestBody UpdateSeatRequest seatChange) throws Exception {
        Map<String, String> response = new HashMap<>();

            ticketService.changeSeat(id, seatChange);
            response.put("message", "Seat changed successfully");
            return ResponseEntity.ok(response);

    }
}


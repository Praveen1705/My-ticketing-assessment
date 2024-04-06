package com.ticketing.mapper;

import com.ticketing.Dto.PassengerDto;
import com.ticketing.entity.TicketDetails;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {

   @Autowired
   private ModelMapper modelMappper ;
  public PassengerDto convertToDto(TicketDetails ticInfo){

     PassengerDto ticketDto = modelMappper.map(ticInfo, PassengerDto.class);
     return ticketDto;
  }
   public TicketDetails convertToModel(PassengerDto ticketDto){
      TicketDetails ticInfo = modelMappper.map(ticketDto, TicketDetails.class);
      return ticInfo;
   }

}

package com.ticketing.repository;

import com.ticketing.entity.TicketDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<TicketDetails,Long> {
}

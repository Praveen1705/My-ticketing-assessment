package com.ticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ticketing.entity.PassengerDetails;

@Repository
public interface PassengerRepo extends JpaRepository<PassengerDetails,Long> {

}

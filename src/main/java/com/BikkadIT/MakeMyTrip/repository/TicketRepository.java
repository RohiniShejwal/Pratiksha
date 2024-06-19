package com.BikkadIT.MakeMyTrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.MakeMyTrip.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}

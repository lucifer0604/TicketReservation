package com.reservation.TicketReservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.TicketReservation.model.Bus;
import com.reservation.TicketReservation.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
	
	List<Seat> findByBusAndIsAvailable(Bus bus,boolean isAvailable);

}

package com.reservation.TicketReservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.TicketReservation.model.Reservation;
import com.reservation.TicketReservation.model.User;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	List<Reservation> findByUser(User user);

}

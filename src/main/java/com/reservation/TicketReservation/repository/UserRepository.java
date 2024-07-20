package com.reservation.TicketReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.TicketReservation.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}

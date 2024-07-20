package com.reservation.TicketReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.TicketReservation.model.Reservation;
import com.reservation.TicketReservation.model.Seat;
import com.reservation.TicketReservation.model.User;
import com.reservation.TicketReservation.service.ReservationService;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
	
	
	
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/reserve")
	public ResponseEntity<Reservation> reserveSeat(@RequestParam User user,@RequestParam Long seatId)
	{
		return ResponseEntity.ok(reservationService.reserveSeat(user, seatId));
	}
	
}

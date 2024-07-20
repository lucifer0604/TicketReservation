package com.reservation.TicketReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.TicketReservation.model.Bus;
import com.reservation.TicketReservation.model.Seat;
import com.reservation.TicketReservation.service.BusService;
import com.reservation.TicketReservation.service.SeatService;

@RestController
@RequestMapping("/api/seats")
public class SeatController {
	
	@Autowired
	SeatService seatService;
	
	@Autowired
	private BusService busService;
	
	
	@GetMapping("/available")
	public ResponseEntity<List<Seat>> getAvialableSeats(@RequestParam Bus bus)
	{
		return ResponseEntity.ok(seatService.getAvailableSeats(bus));		
	}

}

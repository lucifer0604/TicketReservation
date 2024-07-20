package com.reservation.TicketReservation.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.TicketReservation.model.Bus;
import com.reservation.TicketReservation.service.BusService;

@RestController
@RequestMapping("/api/buses")
public class BusController {
	
	@Autowired
	private BusService busService;
	
	
	@GetMapping("/search")
	public ResponseEntity<List<Bus>> searchBuses(@RequestParam String departureLocation,@RequestParam String arrivalLocation,@RequestParam LocalDate departureDate)
	{
		return ResponseEntity.ok(busService.searchBus(departureLocation, arrivalLocation, departureDate));
	}

}

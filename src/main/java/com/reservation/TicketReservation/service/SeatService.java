package com.reservation.TicketReservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.TicketReservation.model.Bus;
import com.reservation.TicketReservation.model.Seat;
import com.reservation.TicketReservation.repository.SeatRepository;

@Service
public class SeatService {
	
	@Autowired
	private SeatRepository seatRepository;
	
	public List<Seat> getAvailableSeats(Bus bus)
	{
		return seatRepository.findByBusAndIsAvailable(bus, true);
	}

}

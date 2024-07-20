package com.reservation.TicketReservation.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.reservation.TicketReservation.model.Bus;
import com.reservation.TicketReservation.repository.BusRepository;

@Service
public class BusService {

	
	@Autowired
	private BusRepository busRepository;
	
	
	public List<Bus> searchBus(String departureLocation,String arrivalLocation,LocalDate departureDate)
	{
		return busRepository.findByDepartureLocationAndArrivalLoctionAndDepartureDate(departureLocation, arrivalLocation, departureDate);
	}
}

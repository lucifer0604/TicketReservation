package com.reservation.TicketReservation.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.TicketReservation.model.Reservation;
import com.reservation.TicketReservation.model.Seat;
import com.reservation.TicketReservation.model.User;
import com.reservation.TicketReservation.repository.ReservationRepository;
import com.reservation.TicketReservation.repository.SeatRepository;

import jakarta.transaction.Transactional;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	private SeatRepository seatRepository;
	
	public Reservation reserveSeat(User user,Long seatId)
	{
		Seat seat= seatRepository.findById(seatId).orElseThrow(()->new RuntimeException("Seat not found"));
		
		if(!seat.isAvailable())
		{
			throw new RuntimeException("Seat not available");
		}
		seat.setAvailable(false);
		seatRepository.save(seat);
		
		Reservation reservation=new Reservation();
		reservation.setUser(user);
		reservation.setSeat(seat);
		reservation.setReservationTime(LocalDate.now());
		
		return reservationRepository.save(reservation);
	}

	

}

package com.reservation.TicketReservation.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private User user;
	@ManyToOne
	private Seat seat;
	
	private LocalDate reservationDate;
	
	
	

	public Reservation(Long id, User user, Seat seat, LocalDate reservationDate) {
		super();
		this.id = id;
		this.user = user;
		this.seat = seat;
		this.reservationDate = reservationDate;
	}

	public Reservation() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public LocalDate getReservationTime() {
		return reservationDate;
	}

	public void setReservationTime(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	
	
	
}

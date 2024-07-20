package com.reservation.TicketReservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int seatNumber;
	private boolean isAvailable;
	
	@ManyToOne
	private Bus bus;
	
	public Seat() {
		super();
	}
	public Seat(Long id, int seatNumber, boolean isAvailable, Bus bus) {
		super();
		this.id = id;
		this.seatNumber = seatNumber;
		this.isAvailable = isAvailable;
		this.bus = bus;
	}





	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getSeatNumber() {
		return seatNumber;
	}



	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}



	public boolean isAvailable() {
		return isAvailable;
	}



	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



	public Bus getBus() {
		return bus;
	}



	public void setBus(Bus bus) {
		this.bus = bus;
	}

	
	
	
	
}

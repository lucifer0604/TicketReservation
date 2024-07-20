package com.reservation.TicketReservation.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departureLocation;
	private String arrivalLoction;
	private LocalDate departureDate;
	private LocalDate arrivalDate;
	
	public Bus() {
		super();
	}

	public Bus(Long id, String departureLocation, String arrivalLoction, LocalDate departureDate,
			LocalDate arrivalDate) {
		super();
		this.id = id;
		this.departureLocation = departureLocation;
		this.arrivalLoction = arrivalLoction;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLoction() {
		return arrivalLoction;
	}

	public void setArrivalLoction(String arrivalLoction) {
		this.arrivalLoction = arrivalLoction;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}


	
	
	
}

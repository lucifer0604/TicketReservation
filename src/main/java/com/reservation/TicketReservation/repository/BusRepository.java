package com.reservation.TicketReservation.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.TicketReservation.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
	List<Bus> findByDepartureLocationAndArrivalLoctionAndDepartureDate(String departureLocation,String arrivalLocation,LocalDate departureDate);

}

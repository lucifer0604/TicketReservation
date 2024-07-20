package com.reservation.TicketReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.TicketReservation.model.User;
import com.reservation.TicketReservation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	
	public User save(User user)
	{
		return repository.save(user);
	}
	
	public User findByUserName(String  username)
	{
		return repository.findByUsername(username);
	}
}

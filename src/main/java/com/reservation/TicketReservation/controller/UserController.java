package com.reservation.TicketReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.TicketReservation.model.User;
import com.reservation.TicketReservation.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user)
	{
		return ResponseEntity.ok(userService.save(user));
	}
	
}

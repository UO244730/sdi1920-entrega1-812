package com.uniovi.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.User;

@Service
public class InsertSampleDataService {

	@Autowired
	private UsersService usersService;
	
	@PostConstruct
	public void init() {
		User user1 = new User("user1@gmail.com", "Iván", "Suárez");
		user1.setPassword("123456");
		User user2 = new User("user2@gmail.com", "Iván", "Castiñeiras");
		user2.setPassword("123456");
		usersService.addUser(user1);
		usersService.addUser(user2);

	}
}

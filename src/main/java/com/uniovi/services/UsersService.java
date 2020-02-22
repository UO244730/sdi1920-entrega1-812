package com.uniovi.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.User;
import com.uniovi.repositories.UserRepository;

@Service
public class UsersService {

	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void init() {
		
	}
	
	public List <User> getUsers(){
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	}

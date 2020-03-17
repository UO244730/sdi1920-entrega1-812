package com.uniovi.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.FriendRequest;
import com.uniovi.entities.User;
import com.uniovi.repositories.FriendRepository;

@Service
public class FriendService {
	
	@Autowired
	private FriendRepository friendRepository;
	
	@PostConstruct
	public void init() {

	}
	
	public List<FriendRequest> getFriends() {
		List<FriendRequest> friends = new ArrayList<FriendRequest>();
		friendRepository.findAll().forEach(friends::add);
		return friends;
	}
	
	public void addFriend(FriendRequest friend) {
		friendRepository.save(friend);
	}

}

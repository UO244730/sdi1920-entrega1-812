package com.uniovi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FriendRequest {
	
	@Id
	@GeneratedValue
	private long id;
	private User fromUser;
	private User toUser;
	private boolean accepted = false;
}

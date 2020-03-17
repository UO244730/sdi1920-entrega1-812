package com.uniovi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FriendRequest {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "fromUser")
	private User fromUser;
	@ManyToOne
	@JoinColumn(name = "toUser")
	private User toUser;
	private boolean accepted = false;
	
	
	public FriendRequest(long id, User fromUser, User toUser) {
		super();
		this.id = id;
		this.fromUser = fromUser;
		this.toUser = toUser;
	}
	
	public FriendRequest(User fromUser, User toUser) {
		super();
		this.fromUser = fromUser;
		this.toUser = toUser;
	}
	
	public FriendRequest() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getFromUser() {
		return fromUser;
	}
	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}
	public User getToUser() {
		return toUser;
	}
	public void setToUser(User toUser) {
		this.toUser = toUser;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
}

package com.uniovi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.uniovi.entities.FriendRequest;

public interface FriendRepository extends CrudRepository<FriendRequest, Long>{

}

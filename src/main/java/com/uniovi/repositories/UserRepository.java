package com.uniovi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uniovi.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmail(String email);
	
	//añadir apellido y email
	@Query("Select r FROM User r WHERE (LOWER(r.name) LIKE LOWER (?1))")
	List<User> searchByNameSurnameAndEmail(String searchtext);
}

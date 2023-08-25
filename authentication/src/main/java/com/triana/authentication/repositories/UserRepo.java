package com.triana.authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.triana.authentication.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	
	User findByEmail(String email);
	
}

package com.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatapp.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	 // Custom query method to find a User by username
	User findByUsername(String username);

}

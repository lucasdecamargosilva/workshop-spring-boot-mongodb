package com.camargo.worshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.camargo.worshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}

package com.vitorcollis.workshopmongo.repository;

import com.vitorcollis.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}

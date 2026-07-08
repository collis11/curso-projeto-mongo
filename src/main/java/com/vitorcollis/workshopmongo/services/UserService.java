package com.vitorcollis.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitorcollis.workshopmongo.domain.User;
import com.vitorcollis.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> fingAll(){
		return repo.findAll();
	}
}

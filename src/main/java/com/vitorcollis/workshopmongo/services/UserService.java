package com.vitorcollis.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitorcollis.workshopmongo.domain.User;
import com.vitorcollis.workshopmongo.repository.UserRepository;
import com.vitorcollis.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> fingAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		 Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}

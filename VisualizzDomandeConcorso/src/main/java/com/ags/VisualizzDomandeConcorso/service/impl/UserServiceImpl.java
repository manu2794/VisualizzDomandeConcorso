package com.ags.VisualizzDomandeConcorso.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ags.VisualizzDomandeConcorso.model.User;
import com.ags.VisualizzDomandeConcorso.repository.UserRepository;
import com.ags.VisualizzDomandeConcorso.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void update(User user) {
		userRepo.save(user);
	}
	
}

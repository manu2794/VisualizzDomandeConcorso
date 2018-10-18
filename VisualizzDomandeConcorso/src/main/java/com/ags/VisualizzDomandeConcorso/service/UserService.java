package com.ags.VisualizzDomandeConcorso.service;

import org.springframework.stereotype.Service;

import com.ags.VisualizzDomandeConcorso.model.User;

@Service
public interface UserService {
	
	public User findByUsername(String username);
	
	public void save(User user);
}

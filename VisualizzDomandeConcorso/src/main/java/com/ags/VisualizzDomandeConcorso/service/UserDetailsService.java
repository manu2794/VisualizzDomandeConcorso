package com.ags.VisualizzDomandeConcorso.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.ags.VisualizzDomandeConcorso.model.User;

@Service("userDetailsService")
public interface UserDetailsService {
	
	public UserDetails loadUserByUsername(String username);
	
	public void save(User user);
}

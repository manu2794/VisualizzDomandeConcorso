package com.ags.VisualizzDomandeConcorso.dao;

import com.ags.VisualizzDomandeConcorso.model.User;

public interface UserDAO {

	public User findByUsername(String username);

}
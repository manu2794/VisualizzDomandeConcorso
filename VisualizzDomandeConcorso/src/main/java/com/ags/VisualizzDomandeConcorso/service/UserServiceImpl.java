package com.ags.VisualizzDomandeConcorso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ags.VisualizzDomandeConcorso.dao.UserDAO;
import com.ags.VisualizzDomandeConcorso.model.User;
import com.ags.VisualizzDomandeConcorso.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private UserDAO userDAO;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;


	@Override
	public void save(User user) {
		user.setPassword(/*bCryptPasswordEncoder.encode(*/user.getPassword());
		userRepository.save(user);
	}

	//	    @Override
	//	    public User findByUsername(String username) {
	//	        return userDAO.findByUsername(username);
	//	    }
	//}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.ags.VisualizzDomandeConcorso.Initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ags.VisualizzDomandeConcorso.model.Role;
import com.ags.VisualizzDomandeConcorso.model.User;
import com.ags.VisualizzDomandeConcorso.repository.UserRepository;

public class DBInit {
	@Component
	public class DatabaseInit implements ApplicationRunner {
		
		@Autowired
		private UserRepository userRepository;
		
		@Override
		public void run(ApplicationArguments arg0) throws Exception {
			Role userRole = new Role("USER");
			User user = new User("manu2794", "password", false, null);
			
			user.setRole(userRole);
		
			this.userRepository.save(user);
		}
	}
}

package com.ags.VisualizzDomandeConcorso.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.ags.VisualizzDomandeConcorso.service.MyUserDetailsService;

//@Configuration		// -->	Permette di definire config generali in un progetto spring
//@EnableWebSecurity	// -->  Abilita l'integrazione con spring MVC e permette
//		di personalizzare le logiche di autenticazione
//		effettuando l'override dei metodi di WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    private AuthenticationSuccessHandler authenticationSuccessHandler;
// 
//    public SecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
//        this.authenticationSuccessHandler = authenticationSuccessHandler;
//    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers( "/css/**", "/", "/login").permitAll()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/user").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
//              .successHandler(authenticationSuccessHandler)
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and().csrf().disable(); // we'll enable this in a later blog post
    }
 
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("{noop}pass").roles("USER")
//                .and()
//                .withUser("admin").password("{noop}pass").roles("ADMIN");
//    }
    
//    @Autowired
//	DataSource dataSource;
//	
//	@Autowired
//	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//		
//	  auth.jdbcAuthentication().dataSource(dataSource)
//		.usersByUsernameQuery(
//			"SELECT username, password, enabled FROM users WHERE username=?")
//		.authoritiesByUsernameQuery(
//			"SELECT username, role FROM users INNER JOIN roles ON rolename=role_id WHERE username=?");
//	}	
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	 
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
	  throws Exception {
	    auth.authenticationProvider(authenticationProvider());
	}
	 
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
	    DaoAuthenticationProvider authProvider
	      = new DaoAuthenticationProvider();
	    authProvider.setUserDetailsService((UserDetailsService) userDetailsService);
//	    authProvider.setPasswordEncoder(encoder());
	    return authProvider;
	}
	 
//	@Bean
//	public PasswordEncoder encoder() {
//	    return new BCryptPasswordEncoder(11);
//	}
}
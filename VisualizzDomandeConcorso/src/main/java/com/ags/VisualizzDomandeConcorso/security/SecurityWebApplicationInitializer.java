package com.ags.VisualizzDomandeConcorso.security;


import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import com.ags.VisualizzDomandeConcorso.config.SecurityConfig;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	
	/* 1) Registra automaticamente lo
	 * "springSecurityFilterChain" per ogni URL dell'app
	 * 2) Aggiunge un ContextLoaderListener che carica "WebSecurityConfig" */
	
	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}
}
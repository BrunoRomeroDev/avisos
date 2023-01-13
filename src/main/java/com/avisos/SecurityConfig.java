package com.avisos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	private static final String[] AUTH_WHITELIST = {
	        "/api/login", 
			"/swagger-resources/**",
	        "/webjars/**",
	        "/v2/**",
	        "/swagger-ui/**",
	        "/swagger-ui.html"
	       
	       
	};
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.csrf().disable()
		.cors().and()
		.authorizeRequests().antMatchers(AUTH_WHITELIST).permitAll();
	
		return http.build();
	}
	

}
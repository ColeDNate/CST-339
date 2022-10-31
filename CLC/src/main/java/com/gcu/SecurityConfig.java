package com.gcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gcu.service.UserBusinessService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	PasswordEncoder passEnc; //Makes a cycle with itself... somehow. 
	//1=2? Because a cycle should need a minimum of 2 - I think.
	
	/** ACTION MESSAGE:
	 * Relying upon circular references is discouraged and they are prohibited by 
	 * default. Update your application to remove the dependency cycle between beans. 
	 * As a last resort, it may be possible to break the cycle automatically by 
	 * setting spring.main.allow-circular-references to true.
	 */
	@Autowired //added just to make sure uBServe is Autowired, can *probably* be removed
	UserBusinessService uBServe;
	
	/**
	 * Anyway, the above store a PasswordEncoder entity in the static passEnc, 
	 * and a UserBusinessService entity in the static uBServe. 
	 */
	
	
	/**
	 * This is a bean that provides a BCryptPasswordEncoder
	 */
	@Bean
	BCryptPasswordEncoder bPassEnc() {
		return new BCryptPasswordEncoder();
	}
	
	/**
	 * This presumably configures the AuthenticationManagerBuilder
	 * @param auth
	 */
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(uBServe)
			.passwordEncoder(passEnc);
	}
	
}

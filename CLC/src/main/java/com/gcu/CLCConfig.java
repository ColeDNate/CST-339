package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.*;
import com.gcu.controller.LoginController;

@Configuration
public class CLCConfig{
	

	@Bean(name="ScheduleInterface") @Primary
	@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
	@RequestScope
	@SessionScope
	public ScheduleInterface getEvents() {
		return new LoginController();
	}
 
}


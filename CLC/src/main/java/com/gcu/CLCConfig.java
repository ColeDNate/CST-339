package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.gcu.service.ScheduleService;
import com.gcu.service.ScheduleServiceInterface;

@Configuration
public class CLCConfig{
	
	@Bean(name="ScheduleService", initMethod="init", destroyMethod="destroy")
	public ScheduleServiceInterface getSchedule() {
		return new ScheduleService();
	}
 
}


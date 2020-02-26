package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean("pbean")
	public Passport  passport() {
		
		return new Passport(1234, new java.util.Date(), new java.util.Date() );
		
	}
	
	@Bean
	public Employee employee() {
		return new Employee(7756, "Scott");
		
	}
	
	

}

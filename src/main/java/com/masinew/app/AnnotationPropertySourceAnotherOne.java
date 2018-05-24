package com.masinew.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AnnotationPropertySourceAnotherOne {
	@Autowired
	Environment env;
	
	@Value("${passsword}")
	private String password;
	
	@Value("${passswords:defaultPassword}")
	private String defaultPassword;
	
	@Bean
	public String getString() {
		System.out.println("call in: AnnotationPropertySourceAnotherOne class >> " + env.getProperty("passsword"));
		System.out.println("passsword value in one of property files: " + password);
		System.out.println("passsword value in one of property files: " + defaultPassword);
		return "getString";
	}
}

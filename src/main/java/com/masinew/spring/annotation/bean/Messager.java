package com.masinew.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:jdbc-db2.properties")
public class Messager {
	private Message message;
	
	@Autowired
	Environment env;
	
	public Messager() {
		System.out.println("CONSTRUCTURE");
		System.out.println("CHAMP >>> " + env);
	}
	
	public void init() {
		System.out.println("Messager method involks init method");
	}
	
	// DO NOT WORK
	public void destroy() {
		System.out.println("Messager method involks dest method");
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
}

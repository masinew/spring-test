package com.masinew.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.masinew.spring.bean.Message;
import com.masinew.spring.bean.Messager;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	@Qualifier("champ1")
	public Message message() {
		Message message = new Message();
		message.setMessage("TEST ANNOTATION");
		return message;
	}
	
	@Bean
	@Qualifier("champ2")
	public Message message2() {
		Message message = new Message();
		message.setMessage("TEST ANOTHER ANNOTATION");
		return message;
	}
	
	@Bean
	public Messager messager() {
		return new Messager();
	}
}

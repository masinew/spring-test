package com.masinew.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.masinew.spring.annotation.bean.IntegerStore;
import com.masinew.spring.annotation.bean.StringStore;

@Configuration
public class MyConfiguration {
	@Bean
	public StringStore stringStore() {
		return new StringStore();
	}
	
	@Bean
	public IntegerStore integerStore() {
		return new IntegerStore();
	}
}

package com.masinew.spring.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.masinew.spring.annotation.bean.ApplicationProperty;


@Configuration
@PropertySource("classpath:asd.properties")
@PropertySource("classpath:${champ12345}")
public class AnnotationPropertyConfig {
	@Autowired
	Environment env;
	
	@Bean
	public ApplicationProperty getApplicationProperty() {
		ApplicationProperty appProp = new ApplicationProperty();
		System.out.println(env.getProperty("a.username"));
		System.out.println(env.getProperty("champ"));
		return appProp;
	}
}

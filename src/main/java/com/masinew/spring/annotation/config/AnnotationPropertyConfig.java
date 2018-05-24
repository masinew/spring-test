package com.masinew.spring.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.masinew.app.AnnotationPropertySourceAnotherOne;
import com.masinew.spring.annotation.bean.ApplicationProperty;


@Configuration
@PropertySource("classpath:asd.properties")
@PropertySource("classpath:${champ12345}")
@Import(AnnotationPropertySourceAnotherOne.class)
public class AnnotationPropertyConfig {
	@Autowired
	Environment env;
	
	@Bean
	@Profile("dev")
	public ApplicationProperty getDevApplicationProperty() {
		ApplicationProperty appProp = new ApplicationProperty();
		System.out.println("DEV PROFILE");
		return appProp;
	}
	
	@Bean
	public ApplicationProperty getDefaultApplicationProperty() {
		ApplicationProperty appProp = new ApplicationProperty();
		System.out.println("DEFAULT PROFILE");
		return appProp;
	}
	
	@Bean
	@Profile("production")
	public ApplicationProperty getProductionApplicationProperty() {
		ApplicationProperty appProp = new ApplicationProperty();
		System.out.println("PRODUCTION PROFILE");
		return appProp;
	}
	
}

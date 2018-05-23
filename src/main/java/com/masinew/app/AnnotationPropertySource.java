package com.masinew.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masinew.spring.annotation.config.AnnotationPropertyConfig;

public class AnnotationPropertySource {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationPropertyConfig.class);
	}
}

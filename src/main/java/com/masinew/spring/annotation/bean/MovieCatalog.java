package com.masinew.spring.annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class MovieCatalog {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

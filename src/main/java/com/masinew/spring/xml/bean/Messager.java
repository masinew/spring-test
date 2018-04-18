package com.masinew.spring.xml.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Messager {
	
	@Autowired
	@Qualifier("champ")
	private List<Message> message;
	
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	
	public List<Message> getMessage() {
		return message;
	}
}

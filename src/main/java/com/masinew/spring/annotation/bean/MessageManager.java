package com.masinew.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.masinew.spring.annotation.annotation.Genre;

public class MessageManager {
	
	@Autowired
	@Qualifier("helloWorldMessage")
	private Message helloWorldMessage;
	
	@Autowired
	@Qualifier("sayHiMessage")
	private Message sayHiMessage;

	public Message getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(Message helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

	public Message getSayHiMessage() {
		return sayHiMessage;
	}

	public void setSayHiMessage(Message sayHiMessage) {
		this.sayHiMessage = sayHiMessage;
	}
}

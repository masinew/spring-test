package com.masinew.spring.annotation.bean;

public class Messager {
	private Message message;
	
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

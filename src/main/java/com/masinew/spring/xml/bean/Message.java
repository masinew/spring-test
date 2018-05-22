package com.masinew.spring.xml.bean;

public class Message {
	private String message;
	
	public void dest() {
		// DO NOT WORK!!!
		System.out.println("CLOSE");
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

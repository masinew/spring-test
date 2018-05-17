package com.masinew.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.masinew.spring.annotation.annotation.Genre;

public class MessageGenre {
	
	@Autowired
	@Genre("champ2")
	private MessageManager msg;

	public MessageManager getMsg() {
		return msg;
	}

	public void setMsg(MessageManager msg) {
		this.msg = msg;
	}
	
}

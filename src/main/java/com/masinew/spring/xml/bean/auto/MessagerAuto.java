package com.masinew.spring.xml.bean.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagerAuto {
	
	
	private MessageAuto message;

	public MessageAuto getMessage() {
		return message;
	}

	@Autowired
	public void setMessage(MessageAuto message) {
		this.message = message;
	}
}

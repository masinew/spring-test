package com.masinew.spring.xml.bean.auto;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepo extends MessageAuto  {
	
	public MessageRepo() {
		super.setMessage("Message from repo");
	}
}

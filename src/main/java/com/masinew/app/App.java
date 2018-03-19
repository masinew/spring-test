package com.masinew.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masinew.bean.Message;

public class App {
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
    	Message message = context.getBean(Message.class);
    	System.out.println(message.getMessage());
    }
}

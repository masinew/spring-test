package com.masinew.app;

import com.masinew.spring.annotation.bean.MovieCatalog;
import com.masinew.spring.annotation.bean.MovieRecommender;
import com.masinew.spring.xml.bean.Jdbc;
import com.masinew.spring.xml.bean.Messager;
import com.masinew.spring.xml.bean.Messager2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masinew.spring.xml.bean.Message;

public class XMLApp {
	
	private String a;
    public static void main( String[] args ) {
    	// XML configuration
    	ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
    	Messager message = context.getBean(Messager.class);
//    	Message customMessage = (Message) context.getBean("customMessage");
    	
    	for (Message mess : message.getMessage()) {
    		System.out.println(mess.getMessage());
    	}
    	
    	
    	Messager2 message2 = context.getBean(Messager2.class);
    	System.out.println(message2.getMessage().getMessage());

		Message customMessage = (Message) context.getBean("customMessage");
		System.out.println(customMessage.getMessage());

		Jdbc db2 = (Jdbc) context.getBean("db2");
		System.out.println(db2.toString());
		
		// MovieRecommeder
		MovieRecommender movieRecommender = context.getBean(MovieRecommender.class);
		MovieCatalog actionCatalog = movieRecommender.getActionCatalog();
		System.out.println(actionCatalog.getName());

    }
}

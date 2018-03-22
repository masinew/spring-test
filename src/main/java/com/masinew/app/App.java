package com.masinew.app;

import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.masinew.bean.Message;
import com.masinew.spring.bean.Messager;
import com.masinew.spring.config.ApplicationConfiguration;

public class App {
    public static void main( String[] args ) {
    	// XML configuration
    	ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
    	com.masinew.bean.Messager message = context.getBean(com.masinew.bean.Messager.class);
//    	Message customMessage = (Message) context.getBean("customMessage");
    	
    	for (Message mess : message.getMessage()) {
    		System.out.println(mess.getMessage());
    	}
    	
    	com.masinew.bean.Messager2 message2 = context.getBean(com.masinew.bean.Messager2.class);
    	System.out.println(message2.getMessage().getMessage());
    	
    	
    	
//    	System.out.println(customMessage.getMessage());
    	
//    	Messager messager = context.getBean(Messager.class);
//    	System.out.println(messager.getMessage().getMessage());

    	// Annoration configuration
    	ApplicationContext actx = new AnnotationConfigApplicationContext(
    			ApplicationConfiguration.class);
    	Messager aMess = actx.getBean(com.masinew.spring.bean.Messager.class);
    	System.out.println(aMess.getMessage().getMessage());
    }
}

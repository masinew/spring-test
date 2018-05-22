package com.masinew.app;

import com.masinew.spring.annotation.annotation.Genre;
import com.masinew.spring.annotation.bean.Message;
import com.masinew.spring.annotation.bean.MessageManager;
import com.masinew.spring.annotation.bean.Messager;
import com.masinew.spring.annotation.bean.MovieCatalog;
import com.masinew.spring.annotation.bean.MovieRecommender;
import com.masinew.spring.annotation.bean.Store;
import com.masinew.spring.annotation.bean.StoreFactory;
import com.masinew.spring.annotation.bean.MessageDepending;
import com.masinew.spring.annotation.config.ApplicationConfiguration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sun.misc.Contended;

public class AnnotationApp {
    public static void main(String[] args) {
        ApplicationContext actx = new AnnotationConfigApplicationContext(
                ApplicationConfiguration.class);
        
        // @Qualifier
        // Message: HelloWorld
        MessageManager messageManager = actx.getBean(MessageManager.class);
        Message helloWorldMsg = messageManager.getHelloWorldMessage();
        System.out.println(helloWorldMsg.getMessage());
        
        // Message: sayHi
        Message sayHiMessage = messageManager.getSayHiMessage();
        System.out.println(sayHiMessage.getMessage());
        
        
        // @Genre: Custom Qualifier
        // MovieCatalog: actionCatalog
        MovieRecommender movieRecommender = actx.getBean(MovieRecommender.class);
        MovieCatalog actionCatalog = movieRecommender.getActionCatalog();
        System.out.println(actionCatalog.getName());
        
        // MovieCatalog: comedyCatalog
        MovieCatalog comedyCatalog = movieRecommender.getComedyCatalog();
        System.out.println(comedyCatalog.getName());
        
        // Generic Autowiring
        StoreFactory storeFactory = actx.getBean(StoreFactory.class);
        System.out.println(storeFactory.getIntegerStore().getValue());
        System.out.println(storeFactory.getStringStore().getValue());
        for (Store<String> store : storeFactory.getStringStoreList()) {
        	System.out.println("List Value: " + store.getValue());
        }
        
        Store<String> forResourceAnnotation = storeFactory.getStringStoreResource();
        System.out.println("ResourceAnnotation: " + forResourceAnnotation.getValue());
        
        // add Component class to the context
        Messager messagerDepending = actx.getBean(Messager.class);
        System.out.println(messagerDepending.getMessage().getMessage());
        System.out.println(sayHiMessage.getMessage());
        messagerDepending.getMessage().setMessage("CHANGE MESSAGE FROM messagerDepending instance");
        
        
        System.out.println(messagerDepending.getMessage().getMessage());
        System.out.println(sayHiMessage.getMessage());
        
    }
}

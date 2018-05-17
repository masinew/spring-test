package com.masinew.spring.annotation.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.masinew.spring.annotation.annotation.Genre;
import com.masinew.spring.annotation.bean.IntegerStore;
import com.masinew.spring.annotation.bean.Message;
import com.masinew.spring.annotation.bean.MessageManager;
import com.masinew.spring.annotation.bean.MovieCatalog;
import com.masinew.spring.annotation.bean.MovieRecommender;
import com.masinew.spring.annotation.bean.Store;
import com.masinew.spring.annotation.bean.StoreFactory;
import com.masinew.spring.annotation.bean.StringStore;

@Configuration
@ComponentScan(basePackages={"com.masinew.spring.annotation"})
public class ApplicationConfiguration {
	
	@Bean
	@Qualifier("helloWorldMessage")
	public Message helloWorldMessage() {
		Message message = new Message();
		message.setMessage("Hello World");
		return message;
	}
	
	@Bean
	@Qualifier("sayHiMessage")
	public Message sayHiMessage() {
		Message message = new Message();
		message.setMessage("Hi...");
		return message;
	}
	
	@Bean
	public MessageManager messager() {
		return new MessageManager();
	}
	
	@Bean
	@Genre("Action")
	public MovieCatalog actionCatagoly() {
		MovieCatalog actionCatalog = new MovieCatalog();
		actionCatalog.setName("FF8");
		return actionCatalog;
	}
	
	@Bean
	@Genre("Comedy")
	public MovieCatalog comedyCatagoly() {
		MovieCatalog comedyCatalog = new MovieCatalog();
		comedyCatalog.setName("Mr. Bean");
		return comedyCatalog;
	}
	
	@Bean
	public MovieRecommender movieRecommender() {
		return new MovieRecommender();
	}
	
	@Bean
	public Store<Integer> integerStore() {
		Store<Integer> store = new Store<Integer>();
		store.setValue(123);
		return store;
	}
	
	@Bean("stringStore1")
    public Store<String> stringStore1() {
		Store<String> store = new Store<String>();
		store.setValue("CHAMP1");
        return store;
    }
	
	@Bean
    public Store<String> stringStore2() {
		Store<String> store = new Store<String>();
		store.setValue("CHAMP2");
        return store;
    }
//	
//	@Bean
//    public List<Store<String>> stringStoreList() {
//		List<Store<String>> storeList = new ArrayList<Store<String>>();
//		Store<String> store = new Store<String>();
//		store.setValue("CHAMP2222");
//		Store<String> store2 = new Store<String>();
//		store2.setValue("CHAMP2");
//		storeList.add(store);
//		storeList.add(store2);
//        return storeList;
//    }
    
    @Bean
    public StoreFactory storeFactory() {
    	return new StoreFactory();
    }
	
}

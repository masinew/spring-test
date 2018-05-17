package com.masinew.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class IntegerStore {
	
	private Store<Integer> store;

	public Store<Integer> getStore() {
		return store;
	}

	public void setStore(Store<Integer> store) {
		this.store = store;
	}
	
	
}

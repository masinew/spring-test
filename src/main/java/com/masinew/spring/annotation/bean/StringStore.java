package com.masinew.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class StringStore {
	Store<String> store;

	public Store<String> getStore() {
		return store;
	}

	public void setStore(Store<String> store) {
		this.store = store;
	}
}

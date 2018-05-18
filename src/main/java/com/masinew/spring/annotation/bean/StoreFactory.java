package com.masinew.spring.annotation.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("storeFactory")
public class StoreFactory {
	
	@Autowired
	private Store<Integer> integerStore;
	
	@Autowired
	private Store<String> stringStore;
	
	@Autowired
	private List<Store<String>> stringStoreList;

	public Store<Integer> getIntegerStore() {
		return integerStore;
	}

	public void setIntegerStore(Store<Integer> integerStore) {
		this.integerStore = integerStore;
	}

	public Store<String> getStringStore() {
		return stringStore;
	}

	public void setStringStore(Store<String> stringStore) {
		this.stringStore = stringStore;
	}

	public List<Store<String>> getStringStoreList() {
		return stringStoreList;
	}

	public void setStringStoreList(List<Store<String>> stringStoreList) {
		this.stringStoreList = stringStoreList;
	}
}

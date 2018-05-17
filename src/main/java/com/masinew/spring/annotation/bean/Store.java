package com.masinew.spring.annotation.bean;

public class Store<E> {
	private E value;

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}
	
	
}

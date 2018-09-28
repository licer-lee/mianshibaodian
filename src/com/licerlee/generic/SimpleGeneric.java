package com.licerlee.generic;

public class SimpleGeneric<T> {

	private T t;
	
	public SimpleGeneric(T t) {
		this.t = t;
	}
	
	public T get(){
		return t;
	};
	
}

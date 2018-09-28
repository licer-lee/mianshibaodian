package com.licerlee.myinterface.designfactory;

public interface HumanServiceFactory<T> {

	T getHumanService(Class<? extends T> c);
	
}

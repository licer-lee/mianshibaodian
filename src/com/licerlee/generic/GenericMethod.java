package com.licerlee.generic;

public class GenericMethod {

	
	public <T, U> void f(T t, U u, String v){
		System.out.println(t.getClass().getName());
		System.out.println(u.getClass().getName());
		System.out.println(v.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		GenericMethod gm = new GenericMethod();
		gm.f("", 2, "hello");
//		gm.f(1);
//		gm.f(2.13f);
		
	}
}

package com.licerlee.myinterface;

public interface MyInterface {

	// 接口字段隐式的是 static final
	String code = "code";
	static final String name = "name";
	
	// 隐式为abstract方式
	void m();
	
	abstract void m1();
	
	default void m2(){
		System.out.println("m2() called by "+this.getClass().getName());
	}
	
	static void m3(){
		System.out.println("m3() called ");
	}
	
	// 嵌套接口
	interface nestInterface{
		
	}
	
}

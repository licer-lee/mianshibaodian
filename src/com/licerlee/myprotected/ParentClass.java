package com.licerlee.myprotected;

// protected 常用于继承
public class ParentClass {

	protected String name;
	
	protected void m(){
		System.out.println("m() called by "+this.getClass().getName());
	}
}

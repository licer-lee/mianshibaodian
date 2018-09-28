package com.licerlee.myprotected;

// 同包子类
public class ChildClass extends ParentClass{

	
	public static void main(String[] args) {
		
		ParentClass pc = new ParentClass();
		pc.m();

		ChildClass  cc = new ChildClass();
		cc.m();
		
	}
	
}

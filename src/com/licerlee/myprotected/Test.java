package com.licerlee.myprotected;

// 同包非子类
public class Test {

	
	public static void main(String[] args) {
		
		ParentClass pc = new ParentClass();
		pc.m();
		
		// 子类中没有重写父类方法，依然可以调用.
		ChildClass cc = new ChildClass();
		cc.m();
		
		
	}
}

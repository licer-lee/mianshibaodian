package com.licerlee.myprotected1;

import com.licerlee.myprotected.ParentClass;

// 不同包子类(特殊)
public class ChildClass1 extends ParentClass {

	public static void main(String[] args) {
		
		
		ParentClass pc = new ParentClass();
//		pc.m();
		
		ChildClass1 cc1 = new ChildClass1();
		cc1.m();
		
	}

}

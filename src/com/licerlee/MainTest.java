package com.licerlee;

import com.licerlee.myprotected.ChildClass;
import com.licerlee.myprotected.ParentClass;

public class MainTest {

	public static void main(String[] args) {
	
		ParentClass pc =new ParentClass();
		// 不同包下类（非子类）的protected方法不能访问
//		pc.m();
		
		ChildClass cc =new ChildClass();
//		cc.m();
	}
	
	
}

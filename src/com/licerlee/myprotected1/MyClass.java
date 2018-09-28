package com.licerlee.myprotected1;

import com.licerlee.myprotected.ParentClass;

// 不同包非子类
public class MyClass {

	public static void main(String[] args) {

		// protected方法不能被其他包下类（非子类）访问
		ParentClass pc = new ParentClass();
		// pc.m();

	}

}

package com.licerlee.myabstract;

public class Test {

	public static void main(String[] args) {
		
		MyCURD cc = new MyCURD();
		
		cc.save();
		
		// abstract方式必须重写
		cc.m1();
		
	}
}

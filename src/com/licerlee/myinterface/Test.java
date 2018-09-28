package com.licerlee.myinterface;

import com.licerlee.myinterface.NestInterfaceClass.Ia;

public class Test {

	public static void main(String[] args) {
		
		// 一般示例
		MyChildInterface mi = new MyInterfaceImpl();
		mi.m();
		mi.m1();
		mi.m2();
		MyInterface.m3();
		mi.m4();
		mi.m5();
		System.out.println(MyInterfaceImpl.code);
		System.out.println(mi.name);
		
		
		// 嵌套接口
		NestInterfaceClass nic = new NestInterfaceClass();
		Ia ia = nic.new IaImpl();
		ia.a();
		
	}
}

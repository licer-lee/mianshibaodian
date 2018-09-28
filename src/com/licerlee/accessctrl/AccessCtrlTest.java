package com.licerlee.accessctrl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AccessCtrlTest {

	public static void main(String[] args) {
		
		int a1 = new defaultCalss().id1;
		int a2 = new ProtectedClass().id2;
//		int a3 = new privateClass().id3; // error
//		int a4 = new childPrivateClass().id3; // error
		int a5 = new ChildProtectedClass().id2;
		
		
		AtomicInteger atomicInteger = new AtomicInteger();
		ExecutorService exec = Executors.newCachedThreadPool();
		
		
		ProtectedClass pc = new ChildProtectedClass();
		pc.m1();
		pc.m2();
		
//		ChildProtectedClass cpc = new ChildProtectedClass();
//		ProtectedClass pc1 = new ProtectedClass();
//		cpc = (ChildProtectedClass) pc1;
//		cpc.m1();
	}

}

class defaultCalss{
	
	int id1;
	
}

class ProtectedClass{
	protected int id2;
	protected void m1(){
		System.out.println("m1() call by protectedClass");
	}
	
	protected void m2(){
		System.out.println("m2() call by protectedClass");
	}
}

class ChildProtectedClass extends ProtectedClass{
	protected void m1(){
		System.out.println("m1() call by childProtectedClass");
	}
	
	protected void m2(){
	}
}

class privateClass{
	private int id3;
}

class childPrivateClass extends privateClass{
	
}


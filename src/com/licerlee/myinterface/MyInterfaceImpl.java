package com.licerlee.myinterface;

public class MyInterfaceImpl implements MyInterface, MyChildInterface {

	@Override
	public void m() {
		System.out.println("m() called by "+this.getClass().getName());
	}

	@Override
	public void m1() {
		System.out.println("m1() called by "+this.getClass().getName());
	}

	@Override
	public void m4() {
		System.out.println("m4() called by "+this.getClass().getName());
		
	}

	@Override
	public void m5() {
		System.out.println("m5() called by "+this.getClass().getName());		
	}

}

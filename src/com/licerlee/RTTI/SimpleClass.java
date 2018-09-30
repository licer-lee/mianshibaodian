package com.licerlee.RTTI;

public class SimpleClass {

	public static void main(String[] args) {

		System.out.println("main start");
		new A();
		System.out.println("A init");

		try {
			Class.forName("com.licerlee.RTTI.B");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("B init");

	}

}

class A {
	static {
		System.out.println("loading A");
	}
}

class B {
	static {
		System.out.println("loading B");
	}
}

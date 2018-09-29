package com.licerlee.innerclass;

// 内部类实现闭包
public class Callbacks {

	public static void main(String[] args) {

		CallImpl1 callImpl1 = new CallImpl1();
		CallImpl2 callImpl2 = new CallImpl2();

		MyIncrement.f(callImpl2);

		Caller caller1 = new Caller(callImpl1);
		Caller caller2 = new Caller(callImpl2.getIncrementableRef());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();

	}

}

interface Incrementable {

	void increment();

}

class CallImpl1 implements Incrementable {

	private int i = 0;

	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}

}

class MyIncrement {
	public void increment() {
		System.out.println("other operation");
	}

	static void f(MyIncrement mi) {
		mi.increment();
	}

}

class CallImpl2 extends MyIncrement {

	private int i = 0;

	public void increment() {
		super.increment();
		i++;
		System.out.println(i);

	}

	private class Closure implements Incrementable {

		@Override
		public void increment() {

			CallImpl2.this.increment();

		}

	}

	Incrementable getIncrementableRef() {
		return new Closure();
	}

}

class Caller {

	private Incrementable incrementable;

	Caller(Incrementable ic) {
		this.incrementable = ic;
	}

	void go() {
		incrementable.increment();
	}

}

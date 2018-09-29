package com.licerlee.innerclass;

public class DotThis {

	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {

		// 内部类获取外部类实例 = 外部类.this
		public DotThis getOuter() {
			return DotThis.this;
		}

	}

	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {

		DotThis dotThis = new DotThis();

		// DotThis.Inner inner = dotThis.new Inner();
		DotThis.Inner inner = dotThis.getInner();

		inner.getOuter().f();

	}

}

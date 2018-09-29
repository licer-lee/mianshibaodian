package com.licerlee.innerclass;

// 内部类继承
public class InheritInner extends WithInner.Inner {

	// public InheritInner() {} // complier faild

	// must init like this
	public InheritInner(WithInner wi) {
		wi.super();
	}

	public static void main(String[] args) {

		WithInner wi = new WithInner();
		
		InheritInner ii = new InheritInner(wi);
		
		
	}

}

class WithInner {
	class Inner {

	}
}

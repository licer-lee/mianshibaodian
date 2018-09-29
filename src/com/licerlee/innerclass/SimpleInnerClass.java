package com.licerlee.innerclass;

// 内部类主要为了隐藏实现细节
public class SimpleInnerClass {

	class InnerClass1 {
		private String name;

		public InnerClass1(String name) {
			this.name = name;
		}

		public String get() {
			return name;
		}

	}

	public InnerClass1 getInner() {
		return new InnerClass1("default");
	}

	public static void main(String[] args) {

		SimpleInnerClass sc = new SimpleInnerClass();
		System.out.println(sc.getInner().get());

		InnerClass1 ic = sc.new InnerClass1("inn1");
		System.out.println(ic.get());
	}
}

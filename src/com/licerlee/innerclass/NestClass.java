package com.licerlee.innerclass;

// 嵌套类 （static内部类）
public class NestClass {

	static class StaticInner {

		String name = "name";

		void m() {
			System.out.println("StaticInner.m()");
		}

	}

	public static void main(String[] args) {

		// StaticInnerClass outer = new StaticInnerClass();

		// 嵌套类（静态内部类）可直接创建对象
		StaticInner inner = new StaticInner();
		inner.m();

	}

}

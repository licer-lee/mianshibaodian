package com.licerlee.jvm.gc;

public class OOM {

	static final int SIZE = 2 * 1024 * 1024;

	public static void main(String[] args) {

		int[] i = new int[SIZE];
		System.out.println(i.length);
	}

}

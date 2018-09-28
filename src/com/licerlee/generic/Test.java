package com.licerlee.generic;

public class Test {

	public static void main(String[] args) {
		
		SimpleGeneric<Integer> sg = new SimpleGeneric<Integer>(1);
		System.out.println(sg.get());
		
		TwoTuple<String, Object> tt = new TwoTuple<>("a", 1);
		System.out.println(tt.toString());
		
	}
}

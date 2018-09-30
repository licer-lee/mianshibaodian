package com.licerlee.string;

public class Test {

	public static void main(String[] args) {

		String s = "hello string";
		System.out.println(s.hashCode());
		String s1 = "hello string";
		System.out.println(s1.hashCode());
		String s2 = s + "!";
		System.out.println(s2.hashCode());
		

		String UpS = s.toUpperCase();
		System.out.println(UpS.hashCode());
		System.out.println(s.toUpperCase() == UpS);
		
		
		
	}

}

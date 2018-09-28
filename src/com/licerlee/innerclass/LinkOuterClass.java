package com.licerlee.innerclass;

public class LinkOuterClass {

	
	private String name = "name1";
	
	public String get(){
		return name;
	}
	
	private String getName(){
		return name;
	}
	
	class Inner{
		
		public String getOutName(){
			// 可访问外部类成员
//			return name;
			return getName();
		}
		
	}
	
	public static void main(String[] args) {
		LinkOuterClass lo = new LinkOuterClass();
		Inner inn = lo.new Inner();
		System.out.println(inn.getOutName());
	}
}

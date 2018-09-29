package com.licerlee.collection;

import java.util.Stack;

// stack 后进先出（LIFO）
public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		for(String s: "I am a programer".split(" "))
			stack.push(s);
		while(!stack.isEmpty())
			System.out.println(stack.pop()+" ");
		
	}
	
}

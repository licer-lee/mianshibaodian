package com.licerlee.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListFeatures {

	public static void main(String[] args) {

		LinkedList<Pet> pets = new LinkedList<>(Arrays.asList(new Pet("a"), new Pet("b"), new Pet("c"), new Pet("d")));

		System.out.println(pets);
		// 获取头元素
		System.out.println("pets.getFirst() " + pets.getFirst());
		// 检索但不删除此列表的头部（第一个元素）
		System.out.println("pets.elemet() " + pets.element());
		// 检索但不删除此列表的头部（第一个元素）
		System.out.println("pets.peek() " + pets.peek());
		System.out.println("pets.remove() " + pets.remove());
		System.out.println("pets.removeFirst()" + pets.removeFirst());
		System.out.println("pets.poll() " + pets.poll());
		System.out.println(pets);
		pets.addFirst(new Pet("aa"));
		System.out.println("after addFirst() " + pets);
		pets.offer(new Pet("bb"));
		System.out.println("after offer() " + pets);
		pets.add(new Pet("cc"));
		System.out.println("after add() " + pets);
		pets.addLast(new Pet("dd"));
		System.out.println("after addLast() " + pets);
		System.out.println("removeLast() " + pets.removeLast());

	}

}

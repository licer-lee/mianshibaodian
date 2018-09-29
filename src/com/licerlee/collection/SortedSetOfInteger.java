package com.licerlee.collection;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetOfInteger {

	public static void main(String[] args) {

		Random random = new Random(47);
		Set<Integer> sortedsets = new TreeSet<>();
		for (int i = 0; i < 10000; i++)
			// 生成0-29之间的整数
			sortedsets.add(random.nextInt(30));
		System.out.println(sortedsets);

	}

}

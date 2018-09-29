package com.licerlee.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

	public static void main(String[] args) {

		Random random = new Random(47);
		Set<Integer> sets = new HashSet<>();
		for (int i = 0; i < 10000; i++)
			// 生成0-29之间的整数
			sets.add(random.nextInt(30));
//		Java编程思想说生成的HashSet是无序的（JDK5），Jdk8测试是从小到大排列的
		System.out.println(sets);
//		[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]

	}

}

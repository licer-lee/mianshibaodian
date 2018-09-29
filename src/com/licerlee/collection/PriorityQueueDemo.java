package com.licerlee.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Random random = new Random(47);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < 10; i++)
			// 插入队尾
			pq.offer(random.nextInt(10 + i));
		QueueDemo.printQ(pq);

		
		List<Integer> ints = Arrays.asList(1, 2, 3, 43, 23, 87, 54, 434, 34, 34, 34, 32, 32);
		pq = new PriorityQueue<>(ints);
		QueueDemo.printQ(pq);
		
		pq = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
		pq.addAll(ints);
		QueueDemo.printQ(pq);
		
		
		String fact = "KDDKWEDQCPACAENVHEW";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringpq = new PriorityQueue<>(strings);
		QueueDemo.printQ(stringpq);
		
		stringpq = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
		stringpq.addAll(strings);
		QueueDemo.printQ(stringpq);
		
		Set<Character> sets = new HashSet<>();
		for(Character c: fact.toCharArray())
			sets.add(c);
		PriorityQueue<Character> setpq = new PriorityQueue<>(sets);
		System.out.println(setpq);
		
		
	}

}

package com.licerlee.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// 队列=先进先出=FIFO
// offer() 插入队尾
// peek()空-->null elemet()空-->exception 不移除元素情况下返回队头
// poll()空-->null remove()空-->exception 移除元素情况下返回队头
public class QueueDemo {

	public static void main(String[] args) {

		Random random = new Random(47);
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < 10; i++)
			// 插入队尾
			q.offer(random.nextInt(10 + i));
		printQ(q);

		Queue<Character> qc = new LinkedList<>();
		for (Character c : "helloQueue".toCharArray())
			qc.offer(c);
		printQ(qc);

	}

	public static void printQ(Queue<? extends Object> queue) {

		while (queue.peek() != null)
			System.out.println(queue.remove() + " ");
		System.out.println();
	}

}

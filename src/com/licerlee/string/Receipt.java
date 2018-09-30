package com.licerlee.string;

import java.util.Formatter;

public class Receipt {

	private double total = 0;
	private Formatter f = new Formatter(System.out); // 指定输出的目的地

	public void printTitle() {
		// 宽度为15的字符串
		// 补充： - 表示对齐方式：%-15s 居左对齐；%15s-居右对齐；默认居右对齐
		f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-15s %5s %10s\n", "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format("%-15.15s %5d %10.2f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%-15.15s %5s %10.2f\n", "Tax", "", total * 0.06);
		f.format("%-15s %5s %10s\n", "", "", "------");
		f.format("%-15.15s %5s %10.2f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
		Formatter ff = new Formatter(System.out);
		ff.format("%5d", 998);
	}

}

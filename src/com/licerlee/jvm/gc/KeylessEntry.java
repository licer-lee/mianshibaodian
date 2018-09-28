package com.licerlee.jvm.gc;

import java.util.HashMap;
import java.util.Map;

public class KeylessEntry {

	static class Key {
		Integer i;

		public Key(Integer i) {
			this.i = i;
		}

		@Override
		public int hashCode() {
			return i.hashCode();
		}

		@Override
		public boolean equals(Object o) {
			boolean response = false;
			if (o instanceof Key) {
				response = (((Key) o).i).equals(this.i);
			}
			return response;
		}

	}

	public static void main(String[] args) {

		Map<Key, String> map = new HashMap<>();
		while (true) {
			for (int i = 0; i < 10000; i++) {

				System.out.println(new Key(i));
				if (!map.containsKey(new Key(i))) {
					map.put(new Key(i), "Nubmer:" + i);
				}
				System.out.println(map.size());
			}
		}

	}
}

package com.licerlee.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintingContainers {

	static Collection<String> fill(Collection<String> list) {

		list.add("rat");
		list.add("cat");
		list.add("dog");
		list.add("dog");
		list.add("pig");

		return list;
	}

	static Map<String, String> fill(Map<String, String> map) {

		map.put("rat", "poly");
		map.put("cat", "tom");
		map.put("dog", "coco");
		return map;
	}

	public static void main(String[] args) {
		
		// 有序，array查询效率高，修改效率低
		System.out.println(fill(new ArrayList<String>()));
		// 有序，linked查询效率低，修改效率高
		System.out.println(fill(new LinkedList<String>()));
		
		// 无序，去重，效率高
		System.out.println(fill(new HashSet<String>()));
		// 去重，按升序排列
		System.out.println(fill(new TreeSet<String>()));
		// 去重，按插入顺序排列
		System.out.println(fill(new LinkedHashSet<String>()));
		
		// 无序，查询快
		System.out.println(fill(new HashMap<String, String>()));
		// 按升序排列
		System.out.println(fill(new TreeMap<String, String>()));
		// 按插入顺序排列，查询快
		System.out.println(fill(new LinkedHashMap<String, String>()));
		
		
		
	}

}

package com.licerlee.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InterfaceVsIterator {

	public static void display(Iterator<Pet> it) {

		while (it.hasNext())
			System.out.println(it.next() + " ");
		System.out.println();

	}

	public static void display(Collection<Pet> list) {

		for (Pet p : list)
			System.out.println(p);
		System.out.println();
	}

	public static void main(String[] args) {

		List<Pet> pets = Arrays.asList(new Pet("a"), new Pet("b"), new Pet("c"), new Pet("d"));
		Set<Pet> sets = new HashSet<Pet>(pets);

		display(pets.iterator());
		display(pets);
		display(sets);

		Map<String, Pet> petMap = new LinkedHashMap<>();
		String[] keys = { "1", "2", "3", "4" };
		for (int i = 0; i < keys.length; i++)
			petMap.put(keys[i], pets.get(i));

		System.out.println(petMap);
		// Map key集合
		System.out.println(petMap.keySet());
		// value 集合
		display(petMap.values());
		
		display(petMap.values().iterator());
		

	}

}

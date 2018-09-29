package com.licerlee.collection;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// ListIterator可以双向移动
public class ListIteration {

	public static void main(String[] args) {

		List<Pet> pets = Arrays.asList(new Pet("lily"), new Pet("kk"), new Pet("poly"), new Pet("kity"));
		ListIterator<Pet> it = pets.listIterator();

		while (it.hasNext()) {

			System.out.println(it.next() + "," + it.nextIndex() + "," + it.previousIndex());

		}

		System.out.println();
		while (it.hasPrevious()) {
			System.out.println(it.previous().name);
		}

		System.out.println();
		System.out.println(pets);

		System.out.println();
		it = pets.listIterator(2);
		while (it.hasNext())
			System.out.println(it.next());

	}

}

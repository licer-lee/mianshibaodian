package com.licerlee.collection;

public class Pet {

	String name;

	public Pet(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet@" + name;
	}
}

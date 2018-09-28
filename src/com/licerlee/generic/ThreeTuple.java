package com.licerlee.generic;

public class ThreeTuple<K,V,Z> extends TwoTuple<K, V> {
	
	private final Z z;
	
	public ThreeTuple(K k, V v, Z z) {
		super(k, v);
		this.z = z;
	}
	
//	public String toString(){
//		return this.k +" "+v +" "+ this.z;
//	}
}

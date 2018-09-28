package com.licerlee.generic;

public class TwoTuple<K,V> {
	
	private final K k;
	private final V v;

	public TwoTuple(K k, V v) {
		this.k = k;
		this.v = v;
	}
	
	public String toString(){
		return k +" "+v;
	}
}

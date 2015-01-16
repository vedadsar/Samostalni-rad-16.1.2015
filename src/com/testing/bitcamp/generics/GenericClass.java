package com.testing.bitcamp.generics;

public class GenericClass<V> {

	private V[] value;
	
	public V[] get() {
		return value;
	}

	public void add(V[] value) {
		this.value = value;
	}			
}

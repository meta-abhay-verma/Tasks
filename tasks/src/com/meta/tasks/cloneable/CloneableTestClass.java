package com.meta.tasks.cloneable;

import java.util.LinkedList;
import java.util.List;

public class CloneableTestClass implements Cloneable {

	public List<Integer> integerList;
	
	
	
	public CloneableTestClass(List<Integer> integerList) {
		this.integerList = integerList;
	}

	public Object clone(){
		List<Integer> integerListCopy = new LinkedList<>();
		integerListCopy.addAll(integerList);
		return new CloneableTestClass(integerListCopy);
	}
	
}

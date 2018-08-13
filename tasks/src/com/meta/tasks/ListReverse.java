package com.meta.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ListReverse {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		
		list.addAll(Arrays.asList(4,8,3,7,2,7,9,3,6,8,2,9,0,7,5,3,0,2,6,33,6,9,2,1,34,45,123,765,34,456,123,53));
		
		long startTime = System.currentTimeMillis();
		for (int run=0; run<1000000;run++)
			Collections.reverse(list);
		long endTime = System.currentTimeMillis();
		System.out.println("Collection Reverse: " + (endTime-startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		for (int run=0; run<1000000;run++)
			reverse(list);
		endTime = System.currentTimeMillis();
		System.out.println("Loop Reverse: " + (endTime-startTime) + "ms");
		
	}
	
	private static void reverse(LinkedList<Integer> list) {
		if (list.isEmpty())
			return;
		Integer integer = list.removeLast();
		reverse(list);
		list.addFirst(integer);
	}
}

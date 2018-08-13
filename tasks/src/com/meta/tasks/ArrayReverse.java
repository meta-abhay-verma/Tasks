package com.meta.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayReverse {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addAll(Arrays.asList(4,8,3,7,2,7,9,3,6,8,2,9,0,7,5,3,0,2,6,33,6,9,2,1,34,45,123,765,34,456,123,53));
		
		long startTime = System.currentTimeMillis();
		for (int run=0; run<1000000;run++)
			Collections.reverse(list);
		long endTime = System.currentTimeMillis();
		System.out.println("Collection Reverse: " + (endTime-startTime) + "ms");
		
		Integer[] integers = {4,8,3,7,2,7,9,3,6,8,2,9,0,7,5,3,0,2,6,33,6,9,2,1,34,45,123,765,34,456,123,53};
		startTime = System.currentTimeMillis();
		for (int run=0; run<1000000;run++) {
			int mid = integers.length>>1;
			for (int i=0; i<mid;i++) {
				Integer integer = integers[i];
				integers[i] = integers[integers.length-i-1];
				integers[integers.length-i-1] = integer;
			}
				
		}
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

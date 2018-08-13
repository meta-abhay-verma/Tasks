package com.meta.tasks.cloneable;

import java.util.Arrays;
import java.util.LinkedList;


public class CloneableTest {

	public static void main(String[] args) {
		
		TestClass testClass = new TestClass(new LinkedList<>(Arrays.asList(5,8,3,9,5)));
		TestClass testClassCopy = testClass;
		
		/*
		 * WITHOUT CLONEABLE
		 * Addition into copy changes size of original list
		 */
		System.out.println(testClass.integerList.size());
		testClassCopy.integerList.add(9);
		System.out.println(testClass.integerList.size());
		

		/*
		 * WITH CLONEABLE
		 * Addition into copy doesn't change size of original list
		 */
		CloneableTestClass cloneableTestClass = new CloneableTestClass(new LinkedList<>(Arrays.asList(5,8,3,9,5)));
		CloneableTestClass copy = (CloneableTestClass) cloneableTestClass.clone();
		System.out.println(cloneableTestClass.integerList.size());
		copy.integerList.add(9);
		System.out.println(cloneableTestClass.integerList.size());
		
	}
	
}

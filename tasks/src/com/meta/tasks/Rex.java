package com.meta.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Rex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		String[] inputs = string.split(",");
		HashMap<Integer, Integer> map = new HashMap<>();
		for(String integer:inputs) {
			if(map.containsKey(Integer.valueOf(integer)))
				map.put(Integer.valueOf(integer),map.get(Integer.valueOf(integer))+1);
			
		}
	}
}

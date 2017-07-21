package org.dimigo.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("짜장면");
		set.add("짬뽕");
		set.add("볶음밥");
		set.add("짜장면");

		System.out.println(set);
	}

}

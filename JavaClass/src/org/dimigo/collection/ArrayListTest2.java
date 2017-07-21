package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dimigo.interfaces.Cat;
import org.dimigo.interfaces.Dog;
import org.dimigo.interfaces.IAnimal;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<IAnimal> list = new ArrayList();
		
		list.add(new Dog());
		list.add(new Cat());
		
		bark(list);
		
		
		List<String> list2 = Arrays.asList("아이유", "싸이", "감자");
	
		List<IAnimal> list3 = Arrays.asList(new Dog(), new Cat());
		bark(list3);
		
		// list -> array
		IAnimal[] arr = new IAnimal[list3.size()];
		list3.toArray(arr);
		
		// array -> list
		List<IAnimal> list4 = Arrays.asList(arr);
		
		
	}
	
	private static void bark(List<IAnimal> list){
		// for-each문으로 Dog, Cat 객체의 bark() 실행
		for(IAnimal a : list){
			a.bark();
		}
	}
}

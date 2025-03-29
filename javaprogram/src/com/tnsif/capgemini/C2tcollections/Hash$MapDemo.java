package com.tnsif.capgemini.C2tcollections;

import java.util.HashMap;
import java.util.Map;

public class Hash$MapDemo {

	public static void main(String[] args) {
		Map<Integer,Integer>map=new HashMap<>();
		
		map.put(1,12);
		map.put(2,13);
		map.put(3,14);
		map.put(4,124);
	//We can get the element in Map Elements
	int item0=map.get(2);
	System.out.println("The get element are is"+item0);
	System.out.println("The intial value is"+map);
	//FInd the Size
	int item=map.size();
	System.out.println("the size is"+item);
	//Remove the Elements in the Map
	System.out.println("Now we can remove the element"+map.remove(1));
	//FInd the Contains
	boolean item1=map.containsKey(2);
	System.out.println("the items are contains "+ item1);
	map.clear();
	System.out.println(map);
	
	}

}

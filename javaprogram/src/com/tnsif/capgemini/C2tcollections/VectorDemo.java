package com.tnsif.capgemini.C2tcollections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	
     
	public static void main(String[] args) {
		List<Integer>Numbers=new Vector<>();
		Numbers.add(20);
		Numbers.add(30);
		Numbers.add(40);
		Numbers.add(50);
		Numbers.add(60);
		
		//we can print all the value
		System.out.println("The total number of values are"+Numbers);
		//we can print the size of the elements
		System.out.println("The size of vector list is"+Numbers.size());
		//we can modifying the value of the List we can follow
		Numbers.set(2,90);
		System.out.println("Nubers list after reset"+Numbers);
		//we can check the particular element that existing in list
		if(Numbers.contains(20))
		{
			System.out.println("The element are found");
		}
	    //we print the Elements on one order we use
		for(Integer items:Numbers)
		{
			System.out.println("The Following Integers are"+items);
		}
	}

}

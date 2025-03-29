package com.tnsif.capgemini.C2tcollections;
import java.util.LinkedList;
import java.util.List;
public class LinkedLIstDemo {
	public static void main(String[] args) 
	{
		List<String> cars=new LinkedList<>();
		 cars.add("toyoto");
		 cars.add("benz");
		 cars.add("tata");
		 cars.add("MG");
		 cars.add("MG");
		 cars.add(null);
		 //print the all the elemennts
		 System.out.println("Print the all the cars are:"+ cars);
		 //print the tata car
		 System.out.println(" print the Tata car we help to"+ cars.get(2));
		 // To modifying the Value we can use the 
		 cars.set(2,"Honda");
		 System.out.println(cars);
		 // To remove the element
		 //stem.out.println("the element are removed by using Linked List"+cars.clear
		 if(cars.contains("tata"));
				 {
			 System.out.println("tata are presented in group");
				 }
		  for(String car:cars)
		  {
			  System.out.println(car);
		  }
		

	}

}

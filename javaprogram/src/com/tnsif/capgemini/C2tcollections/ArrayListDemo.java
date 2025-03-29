package com.tnsif.capgemini.C2tcollections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args)
      {
			
     List <String> cars = new ArrayList<>();
     cars.add("BMW");
     cars.add("volvo");
     cars.add("Tata");
     cars.add("BMW");
     cars.add(null);
     cars.add(null);
     //print the all the values of cars
     System.out.println(cars);
     //set the value to replace
      cars.set(2,"RangeRover");
      System.out.println(cars);
     // we get the size  of the array
      System.out.println(cars.size());
      
     for( String car:cars)
     {
    	 System.out.println("the elements are"+car);
     }
     
     // we can clear all Elements
      cars.clear();
      System.out.println(cars);
	}

}

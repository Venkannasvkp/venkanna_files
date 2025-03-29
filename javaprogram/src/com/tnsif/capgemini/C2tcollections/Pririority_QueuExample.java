package com.tnsif.capgemini.C2tcollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pririority_QueuExample 
    {

	public static void main(String[] args) 
	 {
		Queue<String> cars=new PriorityQueue<>();
		 cars.offer("Benz");
		 cars.offer("Tata");
		 cars.offer("Toyoto");
		 cars.offer("MG");
		 cars.offer("Ark");
		 
		System.out.println(cars);
		System.out.println(cars.poll());
		System.out.println(cars.peek());
		System.out.println(cars.poll());
		System.out.println(cars.peek());
		System.out.println(cars);
		System.out.println(cars.remove("Toyoto"));

	 } 

  }

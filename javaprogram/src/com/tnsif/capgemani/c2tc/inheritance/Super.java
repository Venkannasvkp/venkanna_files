package com.tnsif.capgemani.c2tc.inheritance;

  class Animal5
   {
	void makesound()
	{
		System.out.println("Animal make a sound");
		
	}
  }
   class Dog6 extends Animal5
  {
	void makesound()
	{
	  super.makesound();
	  System.out.println("animal make sound");
 }
  }

public class Super {

	public static void main(String[] args) 
	{
		
		Dog6 obj5=new Dog6();
		 obj5.makesound();
	}
}


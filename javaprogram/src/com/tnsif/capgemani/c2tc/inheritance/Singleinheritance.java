package com.tnsif.capgemani.c2tc.inheritance;

 class Animal
 {
   String name="animal";
   void Eat()
   {
	   System.out.println(name +" is Dancing");
	}
 }
   class Dog extends Animal
   {
	   void bark()
	   {
		   System.out.println("Dog is  crying");
		   
	   }
   }
     public class Singleinheritance 
     {
	  public static void main(String[] args)
	  {
		
		 Dog dog=new Dog();
		 dog.Eat();
		 dog.bark();
		
	
	}

}

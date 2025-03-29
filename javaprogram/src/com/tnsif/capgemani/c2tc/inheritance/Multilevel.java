package com.tnsif.capgemani.c2tc.inheritance;
  class Animal1
  {
	  public String name;

	void dance()
	     {
		  System.out.println("Animal are Eating a food");
	     }
         }
     class Dog1 extends Animal1
        {
	   void barking()
	    {  
		 
		   System.out.println("Dog is barking");   
	     }
	  
         }
     class cat extends Dog1
     {
    	 void meow()

             {
    		 System.out.println("cat is sound like a meow");
    		   }
     }
     class elephant extends cat
     {
    	 void sound()
    	 {
    		 System.out.println("elephant is sound is diferent");
    	 }
     }

public class Multilevel {

	public static void main(String[] args) {
		elephant ele=new elephant();
		ele.dance();
		ele.barking();
		ele.sound();
		
	}
	
		
		
	
}

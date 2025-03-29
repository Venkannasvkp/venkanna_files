package com.tnsif.capgemani.c2tc.inheritance;
 class Animal2
       {
	 void eat()
	    {
		 System.out.println("hello1");
	    }
      }
         class Dog3 extends Animal2
          {
	      void crying()
	      { 
		 System.out.println("hello2");
	       }
          }
		  class Cat3 extends Animal2
           {
	      void meow()
	      {
	     System.out.println("svkp");
	         }
           }
         class Elephat3 extends Animal2
           {
	      void trumpt()
	       {
		 System.out.println("Boys");	
               }
           }
        public class Hierache
         {
         public static void main(String[]args)
         {
        	 Dog3 ghh=new Dog3();
        	 ghh.eat();
        	 ghh.crying();
        	 Cat3 fgg=new Cat3();
        	 fgg.meow();
        	 fgg.eat();
        	
         }
        		 
        	 }
      
       

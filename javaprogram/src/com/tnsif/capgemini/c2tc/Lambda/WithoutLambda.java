package com.tnsif.capgemini.c2tc.Lambda;

interface Running
{
	public void draw();
	
}
class test implements Running
{

	@Override
	public void draw() 
	{
		System.out.println("hello");
	}
	
}
public class WithoutLambda {

	public static void main(String[] args) {
		
		Running object=new test();
		object.draw();
          
	}

}

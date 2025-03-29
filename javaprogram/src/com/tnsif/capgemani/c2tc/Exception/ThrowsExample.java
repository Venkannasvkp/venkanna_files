package com.tnsif.capgemani.c2tc.Exception;

public class ThrowsExample {
	public void check(int age)
	{
		if(age<18)
		{
			
		 throw new ArithmeticException("your not eligible");
		}
		else
		{
			System.out.println("your are eligible");
		}
	}

	public static void main(String[] args)
	{
		ThrowsExample obj=new ThrowsExample();
		obj.check(4);
		System.out.println("welcom");

	}

}

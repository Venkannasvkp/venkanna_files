package com.tnsif.capgemani.c2tc.Exception;

public class ArthamaticException {

	public static void main(String[] args) 
	{
		int a=20;
		int b=0;
		try
		{
		int add=(a/b);
		System.out.println(add);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println("hello venkanna we are faceing som error");
		}

	}

}

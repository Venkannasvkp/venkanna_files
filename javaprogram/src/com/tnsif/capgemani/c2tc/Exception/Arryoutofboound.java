package com.tnsif.capgemani.c2tc.Exception;

public class Arryoutofboound 

{
	public static void main(String[] args)
	{
	 int arr[]= {1,2,3,4};
	try
	{
	   	int i=arr[9];
	   	System.out.println(i);
	}
	  catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	System.out.println("what are what");
	}
}
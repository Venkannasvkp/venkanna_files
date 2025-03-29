package com.tnsif.capgemani.c2tc.Exception;

public class NullpointerException {

	public static void main(String[] args)
	  {
	  String str = null;
	  try
	  {
	   System.out.println(str.length());
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  finally
	  {
	  System.out.println("hello");
	  }

}
}

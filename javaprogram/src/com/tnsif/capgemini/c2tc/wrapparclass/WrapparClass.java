package com.tnsif.capgemini.c2tc.wrapparclass;

public class WrapparClass {

	public static void main(String[] args) 
	{
		//Auto-boxing
		byte primitivebyte=1;
		Byte wrapperbyte=primitivebyte;
		System.out.println("auto-boxing:"+wrapperbyte);
		
		// un-boxing
		byte primitivebytee=wrapperbyte;
		System.out.println("unboxing is:"+primitivebyte);
	
}

}

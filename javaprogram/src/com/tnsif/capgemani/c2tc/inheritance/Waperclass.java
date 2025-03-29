package com.tnsif.capgemani.c2tc.inheritance;
public class Waperclass 
{
	public static void main(String[] args) {
		// This is the Auto-Boxing 
		int primitiveint=21;
		Integer waparclass=primitiveint;
		System.out.println(" The type:"+waparclass);
		// byte
		byte primitivebyte=2;
		Byte waparclassByte=primitivebyte;
		System.out.println("this type are:"+waparclassByte);
       //un boxing 
		byte unboxingbyte=waparclassByte ;
		System.out.println(unboxingbyte);
	}

}
package com.tnsif.capgemani.c2tc.ScannerExample;
import java.util.Scanner;

public class ScannerAdvanced {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any value:");
		while(scan.hasNext())
		if(scan.hasNextInt())
		{
			int intvalue=scan.nextInt();
			System.out.println("your intered value is Integer:"+intvalue);
		}
		else if(scan.hasNextFloat())
		{
			float floatnum=scan.nextFloat();
			System.out.println("Your Enter the value is floating point number:"+ floatnum);
			
		}
		 else
		{
			String unknown=scan.next();
		 System.out.println("your enter unknown input:"+ unknown);
		}
	}
}
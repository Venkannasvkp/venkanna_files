package com.tnsif.capgemani.c2tc.ScannerExample;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your Your name");
		String name=scan.nextLine();
		System.out.println("We can Enter your age");
		int age=scan.nextInt();
		System.out.println("Enter your Height");
	    float height=scan.nextFloat();
	    System.out.println("Enter your CGPA");
	    double cgpa=scan.nextDouble();
	    System.out.println("Enter your Adhar Number");
	    long adhar=scan.nextLong();
	    System.out.println("Enter your how many siblings");
	    short sibling =scan.nextShort();
	    System.out.println("Are you Student");
	    boolean student=scan.nextBoolean();
	    System.out.println("Enter your Blod Group");
	    String group=scan.next();
	    System.out.println("Name is:"+ name);
		System.out.println("your age is:"+age);
		System.out.println("your age is:"+height);
		System.out.println("your CGPA is:"+cgpa);
		System.out.println("your Adhar is"+adhar);
		System.out.println("your siblings"+sibling);		
		System.out.println("your are you student"+student);
		System.out.println("your blod is:"+group);

	}

}

package org.tnsif.capgemini.c2tc.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithOutStream {

	public static void main(String[] args) 
	{
	List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer>result=new ArrayList<>();
	for(Integer number:numbers)
	{
		if(number%2==0)
		{
           int doubler=number*2;
           result.add(doubler);
			
		}
	}
	System.out.println(result);
	}
}

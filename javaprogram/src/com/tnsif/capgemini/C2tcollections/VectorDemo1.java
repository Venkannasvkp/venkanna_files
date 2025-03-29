package com.tnsif.capgemini.C2tcollections;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		List<Integer>Items=new Vector<>();
		
		Thread thread1=new Thread( ()-> {
		for(int i=0; i<=5; i++)
		{
			Items.add(i);
			System.out.println("The Elements are"+i);
		}
			
		});
		
	Thread thread2=new Thread ( ()->{
		for(int i=0; i<5; i++)
		    {
			if(!Items.isEmpty())
			{
				System.out.println("The the values are removed on"+Items);
			}
		}
	});
	
	thread1.start();
	thread2.start();
	
	thread1.join();
	thread2.join();
				

	}

}

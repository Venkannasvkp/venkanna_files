package com.tnsif.capgemini.C2tcollections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack <Integer> stack =new Stack<>();
		 stack.push(1);
		 stack.push(2);
		 stack.push(3);
		 stack.push(4);

		System.out.println("the remove the element:"+stack.pop());
		System.out.println("the remove the element:"+stack.pop());
		System.out.println("the remove the element:"+stack.peek());
		System.out.println("the remove the element:"+stack.isEmpty());
		
	    int position = stack.search(3);
	  
	  
	    	System.out.println("the position  of item  "+ position);
	   
	

	}

}

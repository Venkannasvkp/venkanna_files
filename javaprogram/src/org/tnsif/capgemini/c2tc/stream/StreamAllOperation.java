package org.tnsif.capgemini.c2tc.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamAllOperation 
     {
	public static void main(String[] args) 
	 {
	List<Integer>number5=Arrays.asList(1,2,3,4,5,6,6,7,8,9,10);
	//The map operation
	List<Integer> doubled =number5.stream().map(n->n*2).collect(Collectors.toList());
	System.out.println("Doubled :"+doubled);
	//The Filter operation
	List<Integer>doubled1=number5.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println("The Filter operation is :"+doubled1);	
	//The distinct operation
	List<Integer>doubled2=number5.stream().distinct().collect(Collectors.toList());
	System.out.println("The values:"+doubled2);
	//Limit operation
	List<Integer>dobule3=number5.stream().limit(5).collect(Collectors.toList());
	System.out.println("the LImit values:"+dobule3);
	//sorted operation
	List<Integer>d4=number5.stream().sorted().collect(Collectors.toList());
	System.out.println("List values:"+d4);
	   }
    }

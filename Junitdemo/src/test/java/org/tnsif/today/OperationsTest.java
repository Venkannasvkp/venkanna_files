package org.tnsif.today;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationsTest {

	@Test
	void testAdd() {
		Operations d2=new Operations();
		int actual=d2.add(4, 4);
		int expected=8;
		if(expected==actual)
		 {
	assertEquals(actual,expected,"aditional");
		}
	}

	@Test
	void testSub() 
	{
		Operations d3=new Operations();
		int actual=d3.add(3,3);
		int expected=6;
		if(expected==actual)
		{
			assertEquals(actual,expected,"substraction tes");
		}
	}

	@Test
	void testMul() 
	{
		Operations d4=new Operations();
		int actual=d4.mul(5,5);
		int expected=10;
		if(actual==expected)
		  {
			assertEquals(actual,expected,"multiple opertaon");
			
		  }
        }

	@Test
	void testDiv() 
	{
		Operations d5=new Operations();
		int actual=d5.div(3, 3);
		int expected=1;
		if(actual==expected)
		{
		assertEquals(actual,expected,"divisiopn operation");
		}
	}
}

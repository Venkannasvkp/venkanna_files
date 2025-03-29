package org.tnsif.today;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitdemoTest {

	@Test
	void testAdd() 
	{
	Junitdemo d1=new Junitdemo();
	int actual=d1.add(5,5);
	int expected=10;
	if(expected==actual)
	{
		
	assertEquals(expected,actual,"additional of test case");
      
	}
	}

}

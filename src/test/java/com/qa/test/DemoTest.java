package com.qa.test;


import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {

	@Test
	
	public void sum() {
		
		System.out.println("Sum");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
		
	}
	
	
  @Test
	
	public void subtraction() {
		
		System.out.println("subtraction");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
		
	}
	

  @Test

public void div() {
	
	System.out.println("Div");
	int a = 10;
	int b = 20;
	Assert.assertEquals(2, b/a);
	
}

   @Test

  public void multiply() {
  	
  	System.out.println("Multiply");
  	int a = 10;
  	int b = 20;
  	Assert.assertEquals(200, a*b);
  	
  }
	
	
	
}

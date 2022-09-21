//To Execute Tc multiple times by Using "invocationCount"
package com.section3;

import org.testng.annotations.Test;

public class DemoTestNG6 
{
	@Test(invocationCount=3)
	public void  CreateCustomer()
	{
	System.out.println("Customer Created");
	}
}
